package DesignPatterns.Observer;

public class SMSService implements Observer{
    @Override
    public void update(String message) {
        System.out.println("SMS Service received message: " + message);
    }
}
