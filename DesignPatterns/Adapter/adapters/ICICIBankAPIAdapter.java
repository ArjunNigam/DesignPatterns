package DesignPatterns.Adapter.adapters;

import DesignPatterns.Adapter.BankAPI;
import DesignPatterns.Adapter.Banks.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPI {
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public int checkBalance() {
        return iciciBankAPI.balanceCheck();
    }

    @Override
    public void transferMoney() {
        iciciBankAPI.moneyTransfer();
    }
}
