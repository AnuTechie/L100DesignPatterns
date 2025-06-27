package notificationFactory;

import notificationFactory.factory.NotificationFactory;
import notificationFactory.notifications.Notification;

public class NotificationApp {
    public static void main(String[] args) {
        Notification email = NotificationFactory.createNotification("EMAIL");
        email.notifyUser("Your bank statement is available.");

        Notification sms = NotificationFactory.createNotification("SMS");
        sms.notifyUser("Your OTP is 749102.");

        Notification push = NotificationFactory.createNotification("PUSH");
        push.notifyUser("10,000 credited to your account.");
    }
}
