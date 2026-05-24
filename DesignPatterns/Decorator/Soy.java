package DesignPatterns.Decorator;

public class Soy extends AddOns {



    public Soy(Beverage beverage) {
        super(beverage);

    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Adding Soy");
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 20;
    }
}
