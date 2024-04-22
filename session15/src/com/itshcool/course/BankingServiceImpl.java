package com.itshcool.course;

public class BankingServiceImpl implements BankingService {
    @Override
    public void pay() {
        System.out.println("Paying");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing");
    }
}
