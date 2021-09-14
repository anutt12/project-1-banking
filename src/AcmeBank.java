import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;




public class AcmeBank {


    //ToDo create a method for user login
    //I will need the following: account ID and password
    //if the username and password exist inside the BankData.bankCustomers then show the menu options such that
    //make a deposit
    //make a withdrawal
    //get balance
    //also I need to know from what to account (checking/savings)
    //if time permits let the user transfer money between accounts (checking to savings/savings to checking)
    //if time permits let the user transfer between different users
    //if the account does not exist ask the user to enter the account ID and password again.
    //Create write file in BankData

    public static void userLogin(int accountNumber, String passWord) {
        AccountHolder accountHolder = BankData.bankCustomers.stream().filter(
                account -> account.getAccountNumber() == accountNumber
        ).findFirst().orElse(null);
        if (accountHolder.getAccountNumber() == accountNumber && accountHolder.getPassWord().equals(passWord)) {
            System.out.println("Welcome " + accountHolder.getFirstName());
        } else {
            System.out.println("Incorrect account number or password");
        }
    }

    public static void main(String[] args) throws IOException {
        BankData.readFile("C:\\Users\\anutt\\Desktop\\paypal-sei\\unit1\\java-project-1\\src\\customers.txt");

        //for (int i = 0; i < BankData.bankCustomers.size(); i++) {
            //System.out.println(BankData.bankCustomers.get());

            Scanner accountscanner = new Scanner(System.in);
            Scanner passwordscanner = new Scanner(System.in);
            System.out.println("Enter Account Number:");
            Integer accountNumber = accountscanner.nextInt();
            System.out.println("Enter Password:");
            String passWord = passwordscanner.nextLine();

            AcmeBank.userLogin(accountNumber, passWord);

        }

    }
//}
