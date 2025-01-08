// File Name CheckingAccount.java
import java.io.*;

public class CheckingAccount {
    private double balance = 0;
    private String number;
    private String pass;

    public CheckingAccount() {
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public CheckingAccount(String number, String pass) {
        this.number = number;
        this.pass = pass;
    }


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= balance) {
            balance -= amount;
        }else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getNumber() {
        return number;
    }

    public String getPass() {
        return pass;
    }
}