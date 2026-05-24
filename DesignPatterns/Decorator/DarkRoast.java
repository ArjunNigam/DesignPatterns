package DesignPatterns.Decorator;

public class DarkRoast extends Beverage  {
    @Override
    public void getDescription() {
        System.out.println("Dark Roast Coffee");
    }

    @Override
    public int getCost() {
        return 30;
    }
}
