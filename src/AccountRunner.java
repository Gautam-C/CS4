public class AccountRunner {
    public static void main(String args[]) {

        BankAccount test = new BankAccount("testUser", 69.90, "testPassword");

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
    }
}
