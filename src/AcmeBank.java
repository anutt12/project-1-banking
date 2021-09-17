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
    //create function to create account or login
    //quit/logout function


    public static void main(String[] args) throws IOException {
        BankData.readFile("C:\\Users\\anutt\\Desktop\\paypal-sei\\unit1\\java-project-1\\src\\customers.txt");
        //BankData.writeFile("C:\\Users\\anutt\\Desktop\\paypal-sei\\unit1\\java-project-1\\src\\customers.txt");

        //for (int i = 0; i < BankData.bankCustomers.size(); i++) {
        //System.out.println(BankData.bankCustomers.get());

        System.out.println("Welcome to Acme Bank online portal.");
        System.out.println("Enter 1 to log in, or 2 to create new account");
        Scanner initializeOptionsScanner = new Scanner(System.in);
        int option = initializeOptionsScanner.nextInt();

        if (option == 1) {
            Scanner accountscanner = new Scanner(System.in);
            Scanner passwordscanner = new Scanner(System.in);

            System.out.println("Enter Account Number:");
            Integer accountNumber = accountscanner.nextInt();
            System.out.println("Enter Password:");
            String passWord = passwordscanner.nextLine();
            Functions.userLogin(accountNumber, passWord);
        } else if (option == 2) {
            Functions.createNewAccount();
        } else if (option == 3) {
            System.out.println("Exiting System");
            System.exit(0);
        } else {
            System.out.println("Incorrect choice");
            //Functions.mainMenu(accountHolder);

        }
    }

}


//}
