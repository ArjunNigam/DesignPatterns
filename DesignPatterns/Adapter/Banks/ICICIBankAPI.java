package DesignPatterns.Adapter.Banks;

public class ICICIBankAPI {

    public int balanceCheck()
    {
        System.out.println("Fetching Balance from ICICIBank");
        return 200;
    }

    public void moneyTransfer()
    {
        System.out.println("Money transfer from ICICIBank");
    }
}
