import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BankData {

public static List<AccountHolder> bankCustomers = new ArrayList<>();


    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));

            String currentLine = reader.readLine();

            while (currentLine != null) {
                AccountHolder accountHolder= new AccountHolder();
                String[] data = currentLine.split(",");
                accountHolder.setAccountNumber(Integer.parseInt(data[0]));
                accountHolder.setFirstName(data[1]);
                accountHolder.setLastName(data[2]);
                accountHolder.setPassWord(data[3]);
                CheckingAccount checkingAccount = new CheckingAccount(Float.parseFloat(data[4]));
                SavingsAccount savingsAccount = new SavingsAccount(Float.parseFloat(data[5]));
                accountHolder.setCheckingAccount(checkingAccount);
                accountHolder.setSavingsAccount(savingsAccount);
                bankCustomers.add(accountHolder);

                currentLine = reader.readLine();
            }
        } finally {
            assert reader != null;
            reader.close();
        }
    }

//      static void writeFile(String fileName) throws IOException {
//            File file = new File(fileName);
//            FileWriter fw = new FileWriter(file, true);
//            BufferedWriter br = new BufferedWriter(fw);
//            for(AccountHolder accountHolder : bankCustomers){
//                fw.write((accountHolder.getAccountNumber() + "," + accountHolder.getFirstName() + "," + accountHolder.getLastName() + "," + accountHolder.getPassWord() + "," + accountHolder.getCheckingAccount() + "," + accountHolder.getSavingsAccount()));
//            }
//
//       ;
//            fw.close();
//
//        }

    static void createAccount(AccountHolder accountHolder)throws IOException{
        File fileOut = new File("C:\\Users\\anutt\\Desktop\\paypal-sei\\unit1\\java-project-1\\src\\customers.txt");
        FileWriter fw = new FileWriter(fileOut, true);
        BufferedWriter bufferedWriterNewCustomer = new BufferedWriter(fw);
        String content = accountHolder.getAccountNumber() + "," + accountHolder.getFirstName() + "," + accountHolder.getLastName() + "," + accountHolder.getPassWord() + "," + accountHolder.getCheckingAccount() + "," + accountHolder.getSavingsAccount();
        bufferedWriterNewCustomer.newLine();
        bufferedWriterNewCustomer.write(content);
        bufferedWriterNewCustomer.close();
        fw.close();

    }
    }




