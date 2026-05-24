package DesignPatterns.Factory;

public class MongoDBFactory implements DatabaseFactory {
    @Override
    public Query createQuery() {
        return new MongoDBQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new RepeatableCommit();
    }
}
