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

    public static void main(String[] args) {

        
    }
}
