public class BankAccount {
    private String acctNo;
    private int pin;
    private float balance;
    private String fullName;

    public BankAccount(String acctNo, int pin, float balance, String fullName) {
        this.acctNo = acctNo;
        this.pin = pin;
        this.balance = balance;
        this.fullName = fullName;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public boolean isValidPin(int pin) {
        return this.pin == pin;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(float amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String getFullName() {
        return fullName;
    }
}
