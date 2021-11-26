package acko.testing.acko.controller;

import acko.testing.acko.service.TeamCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TeamController {
    @Autowired
    private TeamCreationService teamCreationService;

    @PostMapping(value = "/save/team")
    public ResponseEntity saveTeam(@RequestBody Map<String,Object> teamData) {
        try {
            teamCreationService.saveTeamAndDeveloper(teamData);
            return new ResponseEntity("Team created successfully",HttpStatus.OK);
        }catch (Exception e) {
            //todo notification alert
            return new ResponseEntity("Error while creating team",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
