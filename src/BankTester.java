/**
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankTester {
    public static void main(String[] args) {
        Bank banko = new Bank();

        boolean run = true;

        while (run) {
            Scanner input = new Scanner(System.in);

            System.out.println("Please select a command from the following menu by entering the corresponding number: ");
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
        }
    }

    public static void addAccount(Bank bank){
        int accNum = 0;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("What is the bank account number?");
            accNum = input.nextInt();
        }
        catch (InputMismatchException e2) {
            System.out.println("Account number can only be integers.");
        }

        BankAccount b = new BankAccount(accNum);
        System.out.println("Adding account number " + accNum);
        bank.addAccount(b);

    }

    public static void deposit(Bank bank) {
        Scanner input = new Scanner(System.in);
        int accNum = 0;
        double amt = 0;
        try {
            System.out.print("\nWhat is the account number of the account you wish to deposit to?");
            accNum = input.nextInt();
        }
        catch (InputMismatchException e2) {
            System.out.println("Account number can only be integers.");
        }
    }

    public static void withdraw(Bank bank) {

    }

    public static void getBal(Bank bank) {

    }

    public static void highBal(Bank bank) {

    }

    public static void lowBal(Bank bank) {

    }
}
