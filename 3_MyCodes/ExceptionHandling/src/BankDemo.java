import java.util.Scanner;

public class BankDemo {

    public static void main(String [] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Hi Welcome to our Bank!\nPlease Enter Your  Account Number:");
        String accountNumber = sc.next();

        System.out.print("Enter Password:");
        String password = sc.next();
        CheckingAccount c = new CheckingAccount(accountNumber, password);
        System.out.print("How much you want to Deposit:");
        double amountDep = sc.nextDouble();
        c.deposit(amountDep);

        try {
            System.out.print("How much you want to withdraw:");
            double amountW = sc.nextDouble();
            c.withdraw(amountW);

            System.out.print("How much you want to withdraw:");
             amountW = sc.nextDouble();
            c.withdraw(amountW);
        }catch(InsufficientFundsException e) {
            System.out.println("Sorry, but you are short of " + e.getAmount()+" Taka");
            //e.printStackTrace();
        }
    }
}