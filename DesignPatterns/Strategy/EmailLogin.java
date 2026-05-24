package DesignPatterns.Strategy;

public class EmailLogin implements LoginStrategy {

    @Override
    public void login() {
        System.out.println("Logging in with email and password...");
        // Implement email login logic here
    }
}
