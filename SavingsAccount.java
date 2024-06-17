import java.util.Arrays;
import java.util.Scanner;
public class SavingsAccount{
    // instance fields
    public static int NextAccountNumber = 1;
    double balance;
    int accountNumber;
    String firstName = new String();
    String surname = new String();
    String fullName = new String();
    String phoneNumber;

    // scanner object
    Scanner getInput = new Scanner(System.in);
    

    public SavingsAccount(String name, String lastName,String contactNumber,double initialBalance){
        firstName = name;
        surname = lastName;
        fullName = name + " " + lastName;
        phoneNumber = contactNumber;
        accountNumber = NextAccountNumber++;
        balance = initialBalance;
    }
    // depositing function
    public void deposit(){
        System.out.println("Enter amount to deposit");
        double depositAmout = getInput.nextDouble();
        balance += depositAmout;
    }
    // withdraw function
    public void withdraw(){
        System.out.println("Enter amount to withdraw");
        double withdrawAmount = getInput.nextDouble();
        if (withdrawAmount < balance){
            balance -= withdrawAmount;
            System.out.println("You have withdrawn " + withdrawAmount + " from your account");
        }
        else {
            System.out.println("Insufficient funds");
        }
        
    }
    // get account number
    public int getAccountNumber(){
        return accountNumber;
    }
    // get account holders full_name 
    public String getAccountName(){
        return firstName + "" + surname;
    }
    // check balance function
    public void checkBalance(){
        System.out.println("Balance: MKW " + balance);
    }
    public String toString(){
        return "SavingsAccount {" +
        "Account number: " + accountNumber +
        ",Account name: " + fullName +
        ",Balance: MKW " + balance +
        '}';  
    }

}