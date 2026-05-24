package DesignPatterns.Strategy;

import java.util.Scanner;

public class Client {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how do you want to Login");
        String loginType = sc.nextLine();
        LoginFactory loginFactory = new LoginFactory();
        LoginStrategy loginStrategy = loginFactory.createLoginStrategy(loginType);
        loginStrategy.login();
    }
}
