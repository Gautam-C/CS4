public class BankAccount {

    private String user;
    private double balance;
    private String password;

    public BankAccount (String user1, double balance1, String password1) {

        user = user1;

        if (balance1 >= 0) {
            balance = balance1;
        } else {
            System.out.println("Your balance is negative");
        }

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

    /**
     * returns current ballance
     */
    public double getBalance() {

        return balance;
    }

    /**
     *returns user
     */
    public String getUser() {

        return user;
    }

    /**
     * returns password
     */
    public String getPassword() {

        return password;
    }

    /**
     * allows you to change your password
     */
    public void changePassword(String newPassword) {

        password = newPassword;
    }

    /**
     * changes owner
     */
    public void newOwner(String newOwner) {
        user = newOwner;
    }

    /**
     * returns user, balance, and password
     */
    public String toString() {
        return "User : " + user + ", Balance : " + balance + ", Password : " + password;
    }

}
