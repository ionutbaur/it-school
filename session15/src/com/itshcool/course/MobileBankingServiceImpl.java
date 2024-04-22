package com.itshcool.course;

public class MobileBankingServiceImpl implements BankingService {
    @Override
    public void pay() {
        StringBuilder stringBuilder = new StringBuilder();
    }

    @Override
    public void withdraw() {
        BankingService bankingService = new MobileBankingServiceImpl();
        bankingService.pay();

        MobileBankingServiceImpl mobileBankingService = new MobileBankingServiceImpl();
        int a;
        double b = mobileBankingService.moneyNumber(0);

        a = (int) b;
        System.out.println(a);
    }

    public int moneyNumber() {
        return 0;
    }

    public double moneyNumber(int number) {
        return 1.9;
    }

    public static void main(String[] args) {
        BankingService bankingService = new MobileBankingServiceImpl();
        bankingService.withdraw();
    }

}
