import java.io.*;

public class InsufficientFundsException extends Exception {
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}