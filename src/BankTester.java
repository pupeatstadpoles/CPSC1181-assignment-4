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
                        break;
                    case (2):
                        break;
                    case (3):
                        break;
                    case (4):
                        break;
                    case (5):
                        break;
                    case (6):
                        break;
                    case (7):
                        run = false;
                        break;
                    default:
                        break;
                }
            } catch (InputMismatchException e1) {
                System.out.println("Please use numbers 1-7 to select a command from the menu.");
            }
        }
    }

    public static void addAccount(Scanner input) {
        int acc;
        System.out.println("What is the bank account number?");

    }
}
