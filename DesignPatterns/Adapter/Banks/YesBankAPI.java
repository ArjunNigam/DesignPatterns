package DesignPatterns.Adapter.Banks;

public class YesBankAPI {

    public int getBalance() {
        System.out.println("Fetching Balance from YesBank");
        return 100;

    }

    public void transfer()
    {
        System.out.println("Transferring Money from YesBank");
    }
}
