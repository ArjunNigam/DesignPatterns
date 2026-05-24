package DesignPatterns.Factory;

public class MongoDB implements Database {

    @Override
    public DatabaseFactory createDBFactory() {
        return new MongoDBFactory();
    }
}
