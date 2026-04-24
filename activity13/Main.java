public class Main {
    public static void main(String[] args) {
        System.out.println("=== Activity 13: Generic Classes - Universal Toolkit ===\n");

        System.out.println("A. String Repository (Simple Type)");
        System.out.println("-----------------------------------");

        Repository<String> guestNames = new Repository<>();

        guestNames.add("Alice");
        guestNames.add("Bob");
        guestNames.add("Charlie");

        System.out.println("Total guests: " + guestNames.size());
        System.out.println("All guests: " + guestNames.getAll());
        System.out.println();

        System.out.println("B. BankAccount Repository (Complex Type)");
        System.out.println("------------------------------------------");

        Repository<BankAccount> bankAccounts = new Repository<>();

        BankAccount account1 = new BankAccount("ACC001", "John Doe", 1500.00);
        BankAccount account2 = new BankAccount("ACC002", "Jane Smith", 2500.00);

        bankAccounts.add(account1);
        bankAccounts.add(account2);

        System.out.println("Total bank accounts: " + bankAccounts.size());

        BankAccount retrievedAccount = bankAccounts.get(0);
        Result<BankAccount> result = new Result<>(retrievedAccount, "Load Successful", true);

        System.out.println("Retrieved account details:");
        result.display();

        System.out.println("\n=== Activity Complete ===");
    }
}
}