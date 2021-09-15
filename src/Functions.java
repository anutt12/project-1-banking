import java.sql.SQLOutput;
import java.util.Scanner;

public class Functions {

    public static void mainMenu(AccountHolder accountHolder) {
        System.out.println("Welcome " + accountHolder.getFirstName());
        System.out.println("Checking, Savings, or Exit");
        System.out.println("Please select (1 checking, 2 savings, or 3 to exit");
        Scanner accountOptionsScanner = new Scanner(System.in);
        int choice = accountOptionsScanner.nextInt();
        if(choice == 1){
            System.out.println("Selecting Checking");
        }else if(choice == 2){
            System.out.println("Selecting Savings");
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