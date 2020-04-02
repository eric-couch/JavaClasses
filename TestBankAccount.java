package com.company;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("0000000001", "Eric Couch", 0.00f);
        BankAccount msAccount = new BankAccount("0000000002","Marissa Sams", 0.00f);
        BankAccount mrAccount = new BankAccount("0000000003", "Maurice Rodrigeuz", 0.00f);

        System.out.println(myAccount.toString());
        myAccount.Deposit(1000.00f);
        System.out.printf("Bank Account " + myAccount.getAccountNumber() + " has a balance of $%,.2f. \n", myAccount.getBalance());

        myAccount.Transfer(100.00f, msAccount);
        System.out.println(myAccount.toString());
        System.out.println(msAccount.toString());
        msAccount.Deposit(5000.00f);
        if (myAccount.getBalance() > msAccount.getBalance()) {
            System.out.println("myAccount has more $$");
        } else {
            System.out.println("Marissa's account has more $$");
        }
        System.out.println(msAccount.toString());
    }
}
