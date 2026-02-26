import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();
        loadAccounts(accounts);

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO JAVA ATM");
        System.out.print("Enter account number to proceed: ");
        String acctNo = sc.nextLine();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

 
        Optional<BankAccount> newSessionUser = accounts.stream()
                .filter(account -> account.getAcctNo().equals(acctNo))
                .findFirst();

        if (newSessionUser.isPresent()) {

            if (newSessionUser.get().isValidPin(pin)) {
                System.out.println("Welcome " + newSessionUser.get().getFullName());
                beginTransaction(newSessionUser.get(), accounts);
            } else {
                System.out.println("Invalid credentials...");
            }

        } else {
            System.out.println("Account not found...");
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

            int c;
            try {
                c = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.nextLine();
                continue;
            }

            switch (c) {

                case 1:
                    System.out.printf("Current Balance: %.2f%n", account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    float d = sc.nextFloat();
                    if (account.deposit(d)) {
                        System.out.printf("Deposit successful. New balance: %.2f%n", account.getBalance());
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    float w = sc.nextFloat();
                    if (account.withdraw(w)) {
                        System.out.printf("Withdrawal successful. New balance: %.2f%n", account.getBalance());
                    }
                    break;

                case 0:
                    System.out.println("Exiting and saving accounts...");
                    saveAccounts(accounts);
                    System.out.println("Saved. Goodbye.");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void saveAccounts(ArrayList<BankAccount> accounts) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("accounts.csv"))) {

            pw.println("Account No,Full Name,Balance,PIN");

            for (BankAccount a : accounts) {
                pw.printf("%s,%s,%.2f,%04d%n",
                        a.getAcctNo(),
                        a.getFullName(),
                        a.getBalance(),
                        a.getPin());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadAccounts(ArrayList<BankAccount> accounts) {
      
        System.out.println("Working directory: " + System.getProperty("user.dir"));

        File file = new File("accounts.csv");
        if (!file.exists()) {
            System.out.println("accounts.csv not found at: " + file.getAbsolutePath());
          
            file = new File("activity4/accounts.csv");
            if (!file.exists()) {
                System.out.println("accounts.csv not found at fallback: " + file.getAbsolutePath());
            } else {
                System.out.println("Found accounts.csv at fallback: " + file.getAbsolutePath());
            }
        } else {
            System.out.println("Found accounts.csv at: " + file.getAbsolutePath());
        }

        try (Scanner reader = new Scanner(file)) {
            if (reader.hasNextLine()) {
                reader.nextLine();
            }

            int count = 0;
            while (reader.hasNextLine()) {
                String line = reader.nextLine().trim();
                if (line.isEmpty())
                    continue;
                String[] cols = line.split(",");

                if (cols.length < 4) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }

                String acctNo = cols[0];
                String fullName = cols[1];
                float balance = Float.parseFloat(cols[2]);
                int pin = Integer.parseInt(cols[3]);

                BankAccount acc = new BankAccount(acctNo, pin, balance, fullName);
                accounts.add(acc);
                count++;
            }
            System.out.println("Loaded accounts: " + count);

        } catch (FileNotFoundException e) {
            System.out.println("accounts.csv not found (after fallback attempts).");
        } catch (NumberFormatException e) {
            System.out.println("Invalid data format in file.");
        }
        
    }
}
