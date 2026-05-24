package DesignPatterns.Factory;

public class RepeatableCommit implements Transaction{
    @Override
    public void read() {
        System.out.println("Reading data with Repeatable Commit isolation level...");
    }
}
