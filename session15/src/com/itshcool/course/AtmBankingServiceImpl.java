package com.itshcool.course;

public class AtmBankingServiceImpl implements BankingService {
    @Override
    public void pay() {
        System.out.println("pay from atm");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw from atm");
    }
}
