package DesignPatterns.Decorator;

public abstract class AddOns extends Beverage {

    public Beverage beverage;
    public AddOns(Beverage beverage) {
        this.beverage = beverage;
    }

}
