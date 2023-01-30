public class BankAccount {
    private double balance;
    private int accountNumber;

    public BankAccount(int anAccountNumber){
        if((anAccountNumber < 1000) || (anAccountNumber > 9999))
            throw new BankAccountException("Account Number must be 4 digits!");
        balance = 0;
        accountNumber = anAccountNumber;
    }

    public BankAccount(int anAccountNumber, double initialBalance){
        if((anAccountNumber < 1000) || (anAccountNumber > 9999))
            throw new BankAccountException("Account Number must be 4 digits!");
        if(initialBalance < 0)
            throw new BankAccountException("Initial Balance cannot be less than 0!");
        balance = initialBalance;
        accountNumber = anAccountNumber;
    }

    public double getBalance() {

        return balance;
    }

    public int getAccountNumber(){

        return accountNumber;
    }

    public void deposit(double amount){

        balance += amount;
    }

    public void withdraw(double amount){
        if(amount > balance)
            throw new BankAccountException("Balance will be less than 0.");
        balance -= amount;
    }

    @Override
    public String toString(){

        return "Account Number: " + accountNumber + "  balance: " + balance;
    }
}
