package DesignPatterns.Observer;

public class Client {

    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();

        Observer email = new EmailService();
        Observer sms = new SMSService();

        notificationService.addObserver(email);
        notificationService.addObserver(sms);

        notificationService.setMessage("New notification arrived !");
    }
}
