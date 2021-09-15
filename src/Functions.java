import java.sql.SQLOutput;
import java.util.Scanner;

public class Functions {

    public static void mainMenu(AccountHolder accountHolder) {
        System.out.println("Welcome " + accountHolder.getFirstName());
        System.out.println("Checking, Savings, or Exit");
        System.out.println("Please select (1 checking, 2 savings, or 3 to exit)");
        Scanner accountOptionsScanner = new Scanner(System.in);
        int choice = accountOptionsScanner.nextInt();

        if(choice == 1){
            System.out.println("Checking");
            System.out.println("Please select (1 Check Balance, 2 Deposit funds, 3 Withdraw Funds, 4 Transfer Funds");
            Scanner checkingOptionsScanner = new Scanner(System.in);
            int checkingChoice = checkingOptionsScanner.nextInt();
            if(checkingChoice == 1){
                System.out.println("Your balance is: ");
            }
            else if(checkingChoice == 2){
                System.out.println("How much would you like to deposit?");
            }else if(checkingChoice == 3){
                System.out.println("How much would you like to withdraw?");
            }else if(checkingChoice == 4){
                System.out.println("Who would you like to transfer to?");
            }
        }else if(choice == 2){
            System.out.println("Savings");
            System.out.println("Please select (1 Check Balance, 2 Deposit funds, 3 Withdraw Funds, 4 Transfer Funds");
            Scanner savingsOptionsScanner = new Scanner(System.in);
            int savingsChoice = savingsOptionsScanner.nextInt();
            if(savingsChoice == 1){
                System.out.println("Your balance is: ");
            }
            else if(savingsChoice == 2){
                System.out.println("How much would you like to deposit?");
            }else if(savingsChoice == 3){
                System.out.println("How much would you like to withdraw?");
            }else if(savingsChoice == 4){
                System.out.println("Where would you like to transfer to?");
            }
        }else if(choice == 3){
            System.out.println("Exiting System");
            System.exit(0);
        }else{
            System.out.println("Incorrect choice");
        }
    }
    public static void userLogin(int accountNumber, String passWord) {
        AccountHolder accountHolder = BankData.bankCustomers.stream().filter(
                account -> account.getAccountNumber() == accountNumber
        ).findFirst().orElse(null);
        if (accountHolder.getAccountNumber() == accountNumber && accountHolder.getPassWord().equals(passWord)) {
            mainMenu(accountHolder);
        } else {
            System.out.println("Incorrect account number or password");
        }
    }

}