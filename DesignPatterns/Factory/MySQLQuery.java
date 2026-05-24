package DesignPatterns.Factory;

public class MySQLQuery implements Query{
    @Override
    public void execute() {
        System.out.println("Executing DesignPatterns.Factory.MySQL query...");
    }
}
