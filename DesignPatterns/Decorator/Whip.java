package DesignPatterns.Decorator;

public class Whip extends AddOns{

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Adding Whip");
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 10;
    }
}
