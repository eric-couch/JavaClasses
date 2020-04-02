package com.company;

public class BankAccount {
    private String AccountNumber;
    private String Owner;
    private float Balance;

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "AccountNumber='" + AccountNumber + '\'' +
                ", Owner='" + Owner + '\'' +
                ", Balance=" + Balance +
                '}';
    }

    public BankAccount(String accountNumber, String owner, float balance) {
        AccountNumber = accountNumber;
        Owner = owner;
        Balance = balance;
    }

    public float Deposit(float amt) {
        if (amt > 0) {
            this.Balance += amt;
        }
        return this.Balance;
    }

    public boolean Transfer(float amt, BankAccount toTransTo) {
        if (amt > 0) {
            this.Balance -= amt;
            toTransTo.Deposit(amt);
            return true;
        }
        return false;
    }
}
