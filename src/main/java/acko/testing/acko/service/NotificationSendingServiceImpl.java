package acko.testing.acko.service;

import acko.testing.acko.model.Developer;
import acko.testing.acko.repository.DeveloperRepository;
import acko.testing.acko.util.NotificationRestHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NotificationSendingServiceImpl implements NotificationSendingService {

    @Autowired
    private DeveloperRepository developerRepository;

    private NotificationRestHelper notificationRestHelper;

    @Override
    public boolean sendNotificationAlert(Map<String,Object> notificationData) {
        Developer developer=getDeveloper((long)notificationData.get("team_id"));
        Map<String,Object> data=new HashMap<>();
        data.put("phone_number",developer.getPhoneNumber());
        data.put("message",notificationData.get("message"));
        notificationRestHelper.sendAlert(data);
        return true;
    }

    private Developer getDeveloper(Long teamId) {
        Developer developer=developerRepository.findDeveloperByTeamId(teamId);
        if(developer==null){
            developerRepository.updateTeam(teamId);
            developer=developerRepository.findDeveloperByTeamId(teamId);
        }else{
            developerRepository.updateDeveloper(developer.getId());
        }
        return developer;
    }
}
