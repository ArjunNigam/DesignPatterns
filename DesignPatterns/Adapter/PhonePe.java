package DesignPatterns.Adapter;

import DesignPatterns.Adapter.adapters.ICICIBankAPIAdapter;
import DesignPatterns.Adapter.adapters.YesBankAPIAdapter;

public class PhonePe {

    public static void main(String[] args) {

        BankAPI bankAPI = new YesBankAPIAdapter();
        bankAPI.checkBalance();
        bankAPI.transferMoney();



        bankAPI = new ICICIBankAPIAdapter();
        bankAPI.checkBalance();
        bankAPI.transferMoney();
    }


}
