public class AccountRunner {
    public static void main(String args[]) {

        BankAccount test = new BankAccount("testUser", 69.90);

        System.out.println(test.getBalance());

    }
}
