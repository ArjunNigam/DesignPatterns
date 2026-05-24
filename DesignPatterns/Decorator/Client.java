package DesignPatterns.Decorator;

public class Client {

    public static void main(String[] args) {


        // Creating a Beverage with DarkRoast Coffee, 1 Milk, 1 Whip and 2 ChocoChips
        Beverage b1 = new ChocoChip(new ChocoChip(new Whip(new Milk(new DarkRoast()))));
        b1.getDescription();
        System.out.println("Total Cost: " + b1.getCost());
    }
}
