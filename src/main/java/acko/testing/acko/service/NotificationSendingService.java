package acko.testing.acko.service;

import java.util.Map;

public interface NotificationSendingService {

    boolean sendNotificationAlert(Map<String,Object> notificationData);
}
