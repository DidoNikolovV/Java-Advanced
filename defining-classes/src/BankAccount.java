public class BankAccount {
    private static int id = 1;
    private double balance;
    private static double interestRate = 0.02;

    BankAccount() {
        id++;
    }

    public static int getId() {
        return id;
    }

    static void  setInterestRate(double interest) {
        BankAccount.interestRate = interest;
    }

    public double getInterest(int years) {
        return interestRate * years * this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

}
