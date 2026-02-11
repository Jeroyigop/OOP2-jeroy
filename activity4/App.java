import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        loadAccounts(accounts);

        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO JAVA ATM");
        System.out.println("Enter account number to proceed:");
        String acctNo = sc.nextLine();
        System.out.println("Enter PIN:");
        int pin = sc.nextInt();

        Optional<BankAccount> newSessionUser = accounts.stream()
                .filter(account -> account.getAcctNo().equals(acctNo))
                .findFirst();

        if (newSessionUser.isPresent()) {
            if (newSessionUser.get().isValidPin(pin)) {
                System.out.println("Welcome...");
                beginTransaction(newSessionUser.get(), accounts);
            } else {
                System.out.println("Invalid credentials...");
            }
        }
    }

    public static void beginTransaction(BankAccount account, ArrayList<BankAccount> accounts) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Menu
                    1. Balance Inquiry
                    2. Deposit
                    3. Withdraw
                    0. Exit
                    """);

            System.out.print("Choice: ");
            int c = sc.nextInt();

            switch (c) {
                case 1:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    float dep = sc.nextFloat();
                    account.deposit(dep);
                    System.out.println("Deposit successful. New balance: " + account.getBalance());
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    float wd = sc.nextFloat();
                    if (account.withdraw(wd)) {
                        System.out.println("Withdrawal successful. New balance: " + account.getBalance());
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 0:
                    saveAccounts(accounts);
                    System.out.println("Thank you for using Java ATM.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void loadAccounts(ArrayList<BankAccount> accounts) {
        try (Scanner reader = new Scanner(new File("accounts.csv"))) {
            reader.nextLine(); // skip the header
            while (reader.hasNextLine()) {
                String[] cols = reader.nextLine().split(",");
                String acctNo = cols[0];
                String fullName = cols[1];
                float balance = Float.parseFloat(cols[2]);
                int pin = Integer.parseInt(cols[3]);

                BankAccount acc = new BankAccount(acctNo, pin, balance, fullName);
                accounts.add(acc);
            }
        } catch (FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void saveAccounts(ArrayList<BankAccount> accounts) {
        try (FileWriter writer = new FileWriter("accounts.csv")) {
            writer.write("acctNo,fullName,balance,pin\n");

            for (BankAccount acc : accounts) {
                writer.write(acc.getAcctNo() + "," + acc.getFullName() + "," + acc.getBalance() + ","
                        + acc.isValidPin(acc.isValidPin())) + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
