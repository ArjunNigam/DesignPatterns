package DesignPatterns.Factory;

public class RepeatableRead implements Transaction {
    @Override
    public void read() {
        System.out.println("Reading data with Repeatable Read isolation level...");
    }
}
