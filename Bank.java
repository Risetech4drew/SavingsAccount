import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    // instance fields
    ArrayList<SavingsAccount> accounts;
    // bank constructor
    public Bank(){
        accounts = new ArrayList<SavingsAccount>();
       
    }
    // scanner object
    Scanner getInput = new Scanner(System.in);
    // creating account function
    public void createAccount(){
        System.out.println("Your first name");
        String name = getInput.nextLine();
        System.out.println("Your last name");
        String lastName = getInput.nextLine();
        System.out.println("Your phone number");
        String contactNumber = getInput.nextLine();
        System.out.println("Your initial deposit");
        double initialBalance = getInput.nextDouble();

        SavingsAccount newAccount = new SavingsAccount(name, lastName, contactNumber, initialBalance);
        accounts.add(newAccount);

    }
    // function that lists accounts
    public void listAccounts(){
        for (SavingsAccount account : accounts){
            System.out.println(account);
        }
    }
    /*A function that searches for an account in accounts ArrayList by accountNumber
     * and returns the account else return string account not found.
     */
  public SavingsAccount findAccount(){
    System.out.println("Enter account number");
    String accountNumber = getInput.nextLine(); 
    for (SavingsAccount account : accounts){
        if (account.getAccountNumber() == accountNumber){
             System.out.println("Account found: " + account);
        }
    }
    return null;
  }


}