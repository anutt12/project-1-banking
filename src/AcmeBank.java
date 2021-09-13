import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;




public class AcmeBank {


    public class userLogin {
        public void run() throws FileNotFoundException {
            Scanner s = new Scanner(new File("customers.txt"));
            Scanner keyboard = new Scanner(System.in);
            String firstName = s.nextLine();
            String lastName = s.nextLine();
            String passWord = s.nextLine();

            String userInput = keyboard.nextLine();
            String passWordInput = keyboard.nextLine();

            if (userInput.equals(firstName + lastName) && passWordInput.equals(passWord)) {
                System.out.println("Welcome " + firstName);
            } else {
                System.out.println("Invalid username and/or password");
            }
        }
    }
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

    public static void main(String[] args) throws IOException {
        BankData.readFile("C:\\Users\\anutt\\Desktop\\paypal-sei\\unit1\\java-project-1\\src\\customers.txt");

        for(int i = 0; i < BankData.bankCustomers.size(); i++){
            System.out.println(BankData.bankCustomers.get(i));

        }
    }

}
