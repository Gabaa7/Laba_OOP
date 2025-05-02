package Lab9.Task5;

public class task5 {
    public static void main(String[] args) {
        Email emailNotification = new Email();
        SMS smsNotification = new SMS();
        Push pushNotification = new Push();

        Notification[] notifications = new Notification[3];

        notifications[0] = emailNotification;
        notifications[1] = smsNotification;
        notifications[2] = pushNotification;

        for (Notification notification : notifications) {
            notification.send("Hello, user!");
        }
    }
}