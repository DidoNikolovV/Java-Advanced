import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Integer, BankAccount> bankAccounts = new HashMap<>();


        while(!input.equals("End")) {
            String[] inputParts = input.split(" ");
            String command = inputParts[0];
            String output = null;
            switch(command) {
                case "Create":
                    int id = BankAccount.getId();
                    BankAccount bankAccount = new BankAccount();
                    bankAccounts.put(id, bankAccount);
                    output = "Account ID" + id + " created";
                    break;
                case "Deposit":
                    BankAccount account = bankAccounts.get(Integer.parseInt(inputParts[1]));
                    if(account == null) {
                        output = "Account does not exist";
                    } else {
                        int amount = Integer.parseInt(inputParts[2]);
                        account.deposit(amount);
                        output = "Deposited " + amount + " to " + "ID" + inputParts[1];
                    }
                    break;
                case "SetInterest":
                        double newInterest = Double.parseDouble(inputParts[1]);
                        BankAccount.setInterestRate(newInterest);
                    break;
                case "GetInterest":
                    BankAccount accountToGetInterest = bankAccounts.get(Integer.parseInt(inputParts[1]));
                    if(accountToGetInterest == null) {
                        output = "Account does not exist";
                    } else {
                        double interest = accountToGetInterest.getInterest(Integer.parseInt(inputParts[2]));
                        output = String.format("%.2f", interest);
                    }
                    break;

            }

            if(output != null) {
                System.out.println(output);

            }
            input = scanner.nextLine();
        }

    }
}