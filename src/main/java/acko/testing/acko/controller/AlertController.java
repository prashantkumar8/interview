package acko.testing.acko.controller;

import acko.testing.acko.service.NotificationSendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class AlertController {

    @Autowired
    private NotificationSendingService notificationSendingService;

    @PostMapping(value = "/send/alert")
    public ResponseEntity sendAlert(@RequestBody Map<String,Object> notificationData) {
        try {
            notificationSendingService.sendNotificationAlert(notificationData);
            return new ResponseEntity("Alert send successfully", HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity("Error in sending alert",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
