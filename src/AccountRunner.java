import java.util.Scanner;

public class AccountRunner {
    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);
        System.out.println("What is the user's name?");
        checkUser();

        System.out.println("What is the starting balance");
        checkBalance();

        System.out.println("What do you want the password to be?");
        checkPassword();


        BankAccount test = new BankAccount(name, balance, password);
        BankAccount noArgs = new BankAccount();

        System.out.println("Balance : " + test.getBalance());
        System.out.println("User : " + test.getUser());

        System.out.println(System.lineSeparator());

        test.addBalance(55);
        System.out.println(System.lineSeparator());
        test.removeBalance(124.9);
        System.out.println(System.lineSeparator());

        System.out.println(test.toString());

        test.changePassword("definitelySecure");
        System.out.println(test.getPassword());

        System.out.println(test.toString());

        System.out.println(noArgs.toString());
    }

    public static void checkUser() {
        if (reader.hasNext()) {
            String name = reader.next();
        } else {
            System.out.println("That is not a valid input");
            checkUser();
        }
    }

    public static void checkBalance() {
        if (reader.hasNextDouble()) {
            String balance = reader.nextDouble();
        } else {
            System.out.println("That is not a valid input");
            checkBalance();
        }
    }

    public static void checkPassword() {
        if (reader.hasNext()) {
            String password = reader.next();
        } else {
            System.out.println("That is not a valid input");
            checkPassword();
        }
    }
}
