package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Subject{

    private List<Observer> observers;
    String message;

    public NotificationService() {
        observers = new ArrayList<Observer>();
    }
    public void setMessage(String message){
        this.message = message;
        notifyObservers();
    }


    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(message);
        }
    }
}
