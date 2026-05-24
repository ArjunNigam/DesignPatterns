package DesignPatterns.Adapter.adapters;

import DesignPatterns.Adapter.BankAPI;
import DesignPatterns.Adapter.Banks.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI {

    YesBankAPI yesBankAPI =  new YesBankAPI();
    @Override
    public int checkBalance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void transferMoney() {
        yesBankAPI.transfer();
    }
}
