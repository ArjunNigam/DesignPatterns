package DesignPatterns.Decorator;

public class ChocoChip extends AddOns{

    public ChocoChip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Adding Choco Chip...");
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 20;
    }
}
