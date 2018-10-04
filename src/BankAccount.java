public class BankAccount {

    private String user;
    private double balance;
    private String password;

    public BankAccount (String user1, double balance1, String password1) {

        user = user1;
        balance = balance1;
        password = password1;
    }

    public BankAccount () {

        user = "You Forgot";
        balance = 0;
        password ="Arguments";
    }

    public void addBalance(double a) {
        if (a < 0) {
            System.out.println("Deposit is less than 0");
        } else {
            balance += a;
            System.out.println("New Balance : " + balance);
        }
    }

    public void removeBalance(double s) {
        if (s > balance) {
            System.out.println("Withdrawal is greater than current balance");
        } else {
            balance -= s;
            System.out.println("New Balance : " + balance);
        }
    }

    public double getBalance() {

        return balance;
    }

    public String getUser() {

        return user;
    }



    public String getPassword() {

        return password;
    }

    public void changePassword(String newPassword) {

        password = newPassword;
    }

    public String toString() {
        return "User : " + user + ", Balance : " + balance + ", Password : " + password;
    }

}
