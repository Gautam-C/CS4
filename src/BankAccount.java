public class BankAccount {

    private String user;
    private double balance;

    public BankAccount (String user1, double balance1) {

        user = user1;
        balance = balance1;
    }

    public void addBalance(double a) {
        if (a < 0) {
            System.out.println("Deposit is less than 0");
        } else {
            balance = balance + a;
        }
    }

    public void removeBalance(double s) {
        if (s > balance) {
            System.out.println("Withdrawal is greater than current balance");
        } else {
            balance = balance - s;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getUser() {
        return user;
    }

}
