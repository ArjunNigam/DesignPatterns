package DesignPatterns.Observer;

import java.util.Observable;

public class EmailService implements Observer{

    public void update(String message) {
        System.out.println("Email Service received message: " + message);
    }
}
