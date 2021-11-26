package acko.testing.acko.service;

import acko.testing.acko.model.Developer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NotificationSendingServiceImpl implements NotificationSendingService {
    @Override
    public boolean sendNotificationAlert(Map<String,Object> notificationData) {
//        List<Developer>  ;
        return true;
    }
}
