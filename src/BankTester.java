/**
 * Name: Pup Abdulgapul
 * Course: CPSC 1181-003
 * Professor: Hengameh Hamavand
 * Program: BankTester
 * Purpose: Test the bank methods and throwing of exceptions
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankTester {
    public static void main(String[] args) throws BankAccountException, BankException{
        Bank banko = new Bank();

        boolean run = true;

        do {
            Scanner input = new Scanner(System.in);

            System.out.println("\n\nPlease select a command from the following menu by entering the corresponding number: ");
            System.out.println("[1] Add a new BankAccount to the Bank.");
            System.out.println("[2] Deposit to a BankAccount.");
            System.out.println("[3] Withdraw from a BankAccount.");
            System.out.println("[4] Get the balance of a BankAccount.");
            System.out.println("[5] Find the BankAccount with the highest balance.");
            System.out.println("[6] Find the BankAccount with the lowest balance.");
            System.out.println("[7] Terminate program.");
            System.out.println("");
            try {
                int command = input.nextInt();

                switch (command) {
                    case (1):
                        addAccount(banko);
                        break;
                    case (2):
                        deposit(banko);
                        break;
                    case (3):
                        withdraw(banko);
                        break;
                    case (4):
                        getBal(banko);
                        break;
                    case (5):
                        highBal(banko);
                        break;
                    case (6):
                        lowBal(banko);
                        break;
                    case (7):
                        System.out.println("Bye!");
                        run = false;
                        break;
                    default:
                        System.out.println("Please use only numbers 1-7 to select a command from the menu.\n\n");
                        break;
                }
            } catch (InputMismatchException e1) {
                System.out.println("Please use numbers 1-7 to select a command from the menu.\n\n");
            }
        } while (run);
    }


    /**
     * Method to add a new account to the bank
     * @param bank
     */
    public static void addAccount(Bank bank) {
        int accNum = 0;
        double initialBal = 0;
        Scanner input = new Scanner(System.in);


        try {
            System.out.println("What is the bank account number?");
            System.out.println("");
            accNum = input.nextInt();
        } catch (InputMismatchException e2) {
            System.out.println("Account number can only be integers.");
        }

        try {
            System.out.println("What is the initial balance?");
            System.out.println("");
            initialBal = input.nextDouble();
            initialBal = Math.round(initialBal * 100) / 100;
        }
        catch (InputMismatchException e3) {
            System.out.println("Balance must be entered as a number eg. 100.2  13.25  14.0");
        }

        if (initialBal > 0.00) {
            BankAccount b = new BankAccount(accNum, initialBal);
            System.out.println("Adding account number " + accNum + " with initial balance of $" + initialBal);
            bank.addAccount(b);
        } else {
            BankAccount b = new BankAccount(accNum);
            System.out.println("Adding account number " + accNum + " with initial balance of $0");
            bank.addAccount(b);
        }
    }

    /**
     * Method to make a deposit to a certain account in the bank
     * @param bank is the bank being passed through
     */
    public static void deposit(Bank bank) {
        Scanner input = new Scanner(System.in);
        int accNum = 0;
        double amt = 0;
        try {
            System.out.print("\nWhat is the account number of the account you wish to deposit to?");
            accNum = input.nextInt();
        } catch (InputMismatchException e2) {
            System.out.println("Account number can only be integers.");
        }

        BankAccount acc = bank.find(accNum);
        System.out.println("Depositing $" + amt + " to account number " + acc);
        bank.deposit(acc, amt);
    }


    /**
     * Method to make a withdrawal from a certain account in the bank
     * @param bank is the bank being passed through
     */
    public static void withdraw(Bank bank) {
        Scanner input = new Scanner(System.in);
        int accNum = 0;
        double amt = 0;
        try {
            System.out.print("\nWhat is the account number of the account you wish to deposit to?");
            accNum = input.nextInt();
        } catch (InputMismatchException e2) {
            System.out.println("Account number can only be integers.");
        }

        BankAccount acc = bank.find(accNum);
        System.out.println("Withdrawing $" + amt + " from account number " + acc);
        bank.withdraw(acc, amt);
    }


    /**
     * Method to get the balance of a certain bank account in the bank
     * @param bank is the bank being passed through
     */
    public static void getBal(Bank bank) {
        Scanner input = new Scanner(System.in);
        int accNum = 0;
        double amt = 0;
        try {
            System.out.print("\nWhat is the account number of the account you wish to deposit to?");
            accNum = input.nextInt();
        } catch (InputMismatchException e2) {
            System.out.println("Account number can only be integers.");
        }


    }


    /**
     * Method to find the account with the highest balance in the bank
     * @param bank is the bank being passed through
     */
    public static void highBal(Bank bank) {
        BankAccount b = bank.getMaximum();
        System.out.println("The account with the highest balance is " + b.toString());
    }


    /**
     * Method to find the bank account with the lowest balance
     * @param bank is the bank being passed through
     */
    public static void lowBal(Bank bank) {
        BankAccount b = bank.getMinimum();
        System.out.println("The account with the lowest balance is " + b.toString());
    }
}
