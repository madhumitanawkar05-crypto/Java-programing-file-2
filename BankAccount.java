public class BankAccount {
    public static void main(String[] args) {

        String accountHolder = "Rahul";
        long accountNumber = 1234567890L;
        double balance = 5000;

        double deposit = 2000;
        balance = balance + deposit;

        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Updated Balance: " + balance);
    }
}
