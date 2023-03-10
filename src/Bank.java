import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    /**
     * Constructor
     */
    public Bank() {

        accounts = new ArrayList<BankAccount>();
    }


    /**
     * Adds an account to the bank's ArrayList
     * @param a is the account to be added
     */
    public void addAccount(BankAccount a) {
        accounts.add(a);
    }


    /**
     * Gets total balance stored in bank across all accounts
     * @return the total balance
     */
    public double getTotalBalance() {
        double total = 0;
        for (BankAccount a : accounts) {
            total = total + a.getBalance();
        }
        return total;
    }

    /**
     * Counts the number of bank accounts whose balance is at least a given value.
     *
     * @param atLeast the balance required to count an account
     * @return the number of accounts having least the given balance
     */
    public int count(double atLeast) {
        int matches = 0;

        for (BankAccount a : accounts) {
            if (a.getBalance() >= atLeast)
                matches++;
        }
        return matches;
    }

    /**
     * Finds a bank account with a given number.
     *
     * @param accountNumber the number to find
     * @return the account with the given number, or null if there is no such account
     */
    public BankAccount find(int accountNumber) {
        for (BankAccount a : accounts) {
            if (a.getAccountNumber() == accountNumber)
                return a;
        }
        throw new BankException("Account does not exist.");
    }

    /**
     * Gets the bank account with the largest balance.
     *
     * @return the account with the largest balance, or null if the bank has no accounts
     */
    public BankAccount getMaximum() {
        if (accounts.size() == 0)
            throw new BankException("No accounts exist.");

        BankAccount largest = accounts.get(0);

        for (int i = 1; i < accounts.size(); i++) {
            BankAccount a = accounts.get(i);
            if (a.getBalance() > largest.getBalance())
                largest = a;
        }
        return largest;
    }

    /**
     * Get the account with the smallest balance stored
     * @return the account with the smallest balance
     */
    public BankAccount getMinimum() {
        if(accounts.size() == 0)
            throw new BankException("No accounts exist.");

        BankAccount smallest = accounts.get(0);

        for (int i = 1; i < accounts.size(); i++) {
            BankAccount a = accounts.get(i);
            if(a.getBalance() < smallest.getBalance())
                smallest = a;
        }
        return smallest;
    }

    /**
     * Makes a withdrawal from a certain account in the bank
     * @param account is a BankAccount in the bank's ArrayList
     * @param amount is the amount to be withdrawn
     */
    public void withdraw(BankAccount account, double amount) {
        for (BankAccount a : accounts) {
            if (a.equals(account)) {
                a.withdraw(amount);
            }
        }
    }

    /**
     * Makes a deposit to a certain account in the bank
     * @param account is a BankAccount in the bank's ArrayList
     * @param amount is the amount to be deposited
     */
    public void deposit(BankAccount account, double amount) {
        for (BankAccount a : accounts) {
            if (a.equals(account)) {
                a.deposit(amount);
            }
        }
    }

    public String toString() {
        return "Bank " + accounts.toString();
    }
}
