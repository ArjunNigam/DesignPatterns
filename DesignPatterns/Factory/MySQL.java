package DesignPatterns.Factory;

public class MySQL implements Database{


    @Override
    public DatabaseFactory createDBFactory() {
        return new MySQLFactory();
    }
}
