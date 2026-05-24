package DesignPatterns.Decorator;

public class Milk extends AddOns{

    public Milk(Beverage beverage) {
        super(beverage);
    }
    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Adding milk to the beverage...");
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 10;
    }
}
