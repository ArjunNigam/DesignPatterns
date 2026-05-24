package DesignPatterns.Decorator;

public class HouseBlend extends Beverage {


    @Override
    public void getDescription() {
            System.out.println("House Blend Coffee");
    }

    @Override
    public int getCost() {
        return 10;
    }
}
