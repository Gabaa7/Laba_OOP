package Lab9.Task5;

public class Push extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}