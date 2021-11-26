package acko.testing.acko.service;

import acko.testing.acko.model.Developer;
import acko.testing.acko.model.Team;
import acko.testing.acko.repository.DeveloperRepository;
import acko.testing.acko.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeamCreationServiceImpl implements TeamCreationService {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private DeveloperRepository developerRepository;

    @Override
    public boolean saveTeamAndDeveloper(Map<String, Object> teamData) {
        saveTeam(teamData);
        return true;
    }

    private void saveTeam(Map<String, Object> data){
        Map<String,Object> teamData=(Map<String,Object>)data.get("team");
        Team team=new Team();
        team.setName((String)teamData.get("name"));
        Team teamPersistentObject=teamRepository.save(team);

        saveDevelopers((List<Map<String,Object>>)data.get("developers"),teamPersistentObject.getId());
    }

    private void saveDevelopers(List<Map<String,Object>> data,Long teamId){
        List<Developer> dataToSave=new ArrayList<>();
        for(Map<String,Object> developer:data) {
            Developer temp=new Developer();
            temp.setName((String)developer.get("name"));
            temp.setPhoneNumber((String)developer.get("phone_number"));
            temp.setTeamId(teamId);
            dataToSave.add(temp);
        }
        developerRepository.saveAll(dataToSave);
    }
}
