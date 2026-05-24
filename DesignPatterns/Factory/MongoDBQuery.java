package DesignPatterns.Factory;

public class MongoDBQuery implements Query {
    @Override
    public void execute() {
        System.out.println("Executing DesignPatterns.Factory.MongoDB query...");
    }
}
