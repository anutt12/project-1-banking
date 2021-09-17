import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {

    public static void mainMenu(AccountHolder accountHolder) {
        System.out.println("Welcome " + accountHolder.getFirstName());
        System.out.println("Checking, Savings, or Exit");
        System.out.println("Please select (1 checking, 2 savings, or 3 to exit)");
        Scanner accountOptionsScanner = new Scanner(System.in);
        int choice = accountOptionsScanner.nextInt();

        if (choice == 1) {
            System.out.println("Checking");
            System.out.println("Please select (1 Check Balance, 2 Deposit funds, 3 Withdraw Funds, 4 Transfer Funds");
            Scanner checkingOptionsScanner = new Scanner(System.in);
            int checkingChoice = checkingOptionsScanner.nextInt();
            if (checkingChoice == 1) {
                System.out.println("Your balance is: " + accountHolder.getCheckingAccount().getBalance());
                Functions.mainMenu(accountHolder);

            } else if (checkingChoice == 2) {
                System.out.println("How much would you like to deposit?");
                System.out.println("Enter Amount: ");
                Scanner checkingDepositScanner = new Scanner(System.in);
                double amount = checkingDepositScanner.nextDouble();
                try {
                    if (amount > 0) {
                        accountHolder.getCheckingAccount().depositMoney(amount);
                        System.out.println("Your new balance is: " + accountHolder.getCheckingAccount().getBalance());
                        Functions.mainMenu(accountHolder);
                    } else {
                        System.out.println("Invalid amount.");
                        Functions.mainMenu(accountHolder);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Return to Menu");
                    Functions.mainMenu(accountHolder);
                }


            } else if (checkingChoice == 3) {
                System.out.println("How much would you like to withdraw?");
                System.out.println("Enter Amount: ");
                Scanner checkingWithdrawalScanner = new Scanner(System.in);
                double amount = checkingWithdrawalScanner.nextDouble();
                try {
                    if (amount > 0) {
                        accountHolder.getCheckingAccount().withdrawalMoney(amount);
                        System.out.println("Your new balance is: " + accountHolder.getCheckingAccount().getBalance());
                        Functions.mainMenu(accountHolder);
                    } else {
                        System.out.println("Invalid amount.");
                        Functions.mainMenu(accountHolder);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Return to Menu");
                    Functions.mainMenu(accountHolder);
                }
            } else if (checkingChoice == 4) {
                System.out.println("Where would you like to transfer to?");
                System.out.println("Please select (1 Savings, 2 Another Member's Account)");
                Scanner transferOptionsScanner = new Scanner(System.in);
                int checkingTransferChoice = transferOptionsScanner.nextInt();
                if (checkingTransferChoice == 1) {
                    System.out.println("How much would you like to transfer?");
                    System.out.println("Enter Amount: ");
                    Scanner toSavingsScanner = new Scanner(System.in);
                    double amount = toSavingsScanner.nextDouble();
                    try {
                        if (amount > 0) {
                            accountHolder.getCheckingAccount().withdrawalMoney(amount);
                            accountHolder.getSavingsAccount().depositMoney(amount);
                            System.out.println("Your checking account balance is now: " + accountHolder.getCheckingAccount().getBalance());
                            System.out.println("Your savings account balance is now: " + accountHolder.getSavingsAccount().getBalance());
                            Functions.mainMenu(accountHolder);
                        } else {
                            System.out.println("Invalid amount.");
                            Functions.mainMenu(accountHolder);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Return to Menu");
                        Functions.mainMenu(accountHolder);
                    }
                } else if (checkingTransferChoice == 2) {
                    System.out.println("");
                }
            }
        } else if (choice == 2) {
            System.out.println("Savings");
            System.out.println("Please select (1 Check Balance, 2 Deposit funds, 3 Withdraw Funds, 4 Transfer Funds");
            Scanner savingsOptionsScanner = new Scanner(System.in);
            int savingsChoice = savingsOptionsScanner.nextInt();
            if (savingsChoice == 1) {
                System.out.println("Your balance is: " + accountHolder.getSavingsAccount().getBalance());
                Functions.mainMenu(accountHolder);
            } else if (savingsChoice == 2) {
                System.out.println("How much would you like to deposit?");
                System.out.println("Please Enter amount: ");
                Scanner savingsDepositScanner = new Scanner(System.in);
                double amount = savingsDepositScanner.nextDouble();
                try {
                    if (amount > 0) {
                        accountHolder.getSavingsAccount().depositMoney(amount);
                        System.out.println("Your new balance is: " + accountHolder.getSavingsAccount().getBalance());
                        Functions.mainMenu(accountHolder);
                    } else {
                        System.out.println("Invalid amount.");
                        Functions.mainMenu(accountHolder);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Return to Menu");
                    Functions.mainMenu(accountHolder);
                }
            } else if (savingsChoice == 3) {
                System.out.println("How much would you like to withdraw?");
                System.out.println("Please Enter Amount: ");
                Scanner savingsWithdrawalScanner = new Scanner(System.in);
                double amount = savingsWithdrawalScanner.nextDouble();
                try {
                    if (amount > 0) {
                        accountHolder.getSavingsAccount().withdrawalMoney(amount);
                        System.out.println("Your new balance is: " + accountHolder.getSavingsAccount().getBalance());
                        Functions.mainMenu(accountHolder);
                    } else {
                        System.out.println("Invalid amount.");
                        Functions.mainMenu(accountHolder);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Return to Menu");
                    Functions.mainMenu(accountHolder);
                }
            } else if (savingsChoice == 4) {
                System.out.println("Where would you like to transfer to?");
                System.out.println("Please select (1 Checking, 2 Another Member's Account)");
                Scanner transferOptionsScanner = new Scanner(System.in);
                int savingsTransferChoice = transferOptionsScanner.nextInt();
                if (savingsTransferChoice == 1) {
                    System.out.println("How much would you like to transfer?");
                    System.out.println("Enter Amount: ");
                    Scanner toCheckingScanner = new Scanner(System.in);
                    double amount = toCheckingScanner.nextDouble();
                    try {
                        if (amount > 0) {
                            accountHolder.getSavingsAccount().withdrawalMoney(amount);
                            accountHolder.getCheckingAccount().depositMoney(amount);
                            System.out.println("Your savings account balance is now: " + accountHolder.getSavingsAccount().getBalance());
                            System.out.println("Your checking account balance is now: " + accountHolder.getCheckingAccount().getBalance());
                            Functions.mainMenu(accountHolder);
                        } else {
                            System.out.println("Invalid amount.");
                            Functions.mainMenu(accountHolder);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Return to Menu");
                        Functions.mainMenu(accountHolder);
                    }
                } else if (savingsTransferChoice == 2) {
                    System.out.println("");
                }
            }
        } else if (choice == 3) {
            System.out.println("Exiting System");
            System.exit(0);
        } else {
            System.out.println("Incorrect choice");
            Functions.mainMenu(accountHolder);

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

    public static void createNewAccount(){
        AccountHolder accountHolder = new AccountHolder();
        System.out.println("Enter first name: ");
        Scanner firstNameScanner = new Scanner(System.in);
        String firstName = firstNameScanner.next();
        System.out.println("Enter last name: ");
        Scanner lastNameScanner = new Scanner(System.in);
        String lastName = lastNameScanner.next();
        System.out.println("Create password: ");
        Scanner pwScanner = new Scanner(System.in);
        String passWord = pwScanner.next();
        System.out.println("How much would you like to deposit to get your checking account funded?");
        System.out.println("Please enter amount: ");
        Scanner newAccountBalanceScanner = new Scanner(System.in);
        float initialDeposit = newAccountBalanceScanner.nextFloat();
        CheckingAccount checkingAccount = new CheckingAccount(initialDeposit);
        System.out.println("How much would you like to deposit to get your savings account funded?");
        System.out.println("Please enter amount: ");
        float firstSavingsDeposit = newAccountBalanceScanner.nextFloat();
        SavingsAccount savingsAccount = new SavingsAccount(firstSavingsDeposit);
        AccountHolder lastAccount = BankData.bankCustomers.get(BankData.bankCustomers.size() - 1);
        accountHolder.setAccountNumber(lastAccount.getAccountNumber() + 1);
        accountHolder.setFirstName(firstName);
        accountHolder.setLastName(lastName);
        accountHolder.setPassWord(passWord);
        accountHolder.setCheckingAccount(checkingAccount);
        accountHolder.setSavingsAccount(savingsAccount);
        System.out.println("Thank you for becoming a member of Acme Bank. Your UserID is " + accountHolder.getAccountNumber());
        System.out.println("Your checking account balance is " + accountHolder.getCheckingAccount().getBalance());
        System.out.println("Your savings account balance is " + accountHolder.getSavingsAccount().getBalance());
        BankData.bankCustomers.add(accountHolder);
        try{
            BankData.createAccount(accountHolder);
        }catch (IOException e){
            e.printStackTrace();
        }




    }

}

