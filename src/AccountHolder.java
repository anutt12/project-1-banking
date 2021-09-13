public class AccountHolder {

    private String firstName;
    private String lastName;
    private String passWord;
    private int accountNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountHolder(String firstName, String lastName, String passWord, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passWord = passWord;
        this.accountNumber = accountNumber;


    }
}
