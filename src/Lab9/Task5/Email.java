package Lab9.Task5;

public class Email extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}