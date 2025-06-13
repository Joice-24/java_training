package opps;

public class Task2 {
    static class BankAccount {
        double balance = 1000;  
        void deposit(double amount) {
            balance += amount;
        }
        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Not enough balance");
            }
        }

        void showBalance() {
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(500);  
        b.withdraw(2000);  
        b.showBalance();  
    }
}
