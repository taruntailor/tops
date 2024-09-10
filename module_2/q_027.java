//W.A.J.Pto create a custom exception if Customer withdraw
//amount which is greater than account balance then
//program will show custom exception otherwise amount
//will deduct from account balance. Account balance is:
//2000 Enter withdraw amount: 2500 o Sorry, insufficient
//balance, you need more 500 Rs. To perform this
//transaction.
package module_2;

import java.util.Scanner;

//Custom exception class
class InsufficientBalanceException extends Exception {
 private int amount;

 public InsufficientBalanceException(int amount) {
     super("Sorry, insufficient balance, you need more " + amount + " Rs. to perform this transaction.");
     this.amount = amount;
 }

 public int getAmount() {
     return amount;
 }
}

public class q_027 {

 private static final int ACCOUNT_BALANCE = 2000;

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Account balance is: " + ACCOUNT_BALANCE);
     System.out.print("Enter withdraw amount: ");
     int withdrawAmount = scanner.nextInt();

     try {
         withdraw(withdrawAmount);
         System.out.println("Transaction successful. Remaining balance: " + (ACCOUNT_BALANCE - withdrawAmount));
     } catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage());
     }
 }

 // Method to perform withdrawal
 public static void withdraw(int amount) throws InsufficientBalanceException {
     if (amount > ACCOUNT_BALANCE) {
         int needed = amount - ACCOUNT_BALANCE;
         throw new InsufficientBalanceException(needed);
     }
 }
}

