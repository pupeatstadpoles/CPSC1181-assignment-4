# Bank and BankTester
 
Learning to handle, throw and create custom exceptions. Completed Feb 2023

The program BankTester creates a Bank object and displays a menu for the user to test the Bank's functions, such as: 

- Adding a new BankAccount to the Bank
- Getting the balance based on the account number
- Deposit money to an existing BankAccount
- Withdraw money from an existing BankAccount
- Find the BankAccount with the highest balance
- Find the BankAccount with the lowest balance

Each bank account has it's own unique account number and private balances which can be accessed through getter and setter methods. A custom BankAccountException class and BankException class was created, and the constructor of the BankAccount was modified to throw a BankAccountException if the account number passed in was not 4 digits or the balance is less than 0, while the Bank's `find()` and `getMaximum()` methods throw a BankException if no such account exists within the ArrayList for the account number passed in.
