import org.junit.Test;
import static org.junit.Assert.*;

public class Project1Test {

    @Test
    public void checkingAccountWithdrawTest() {
        CheckingAccount checkingAccount = new CheckingAccount(250);
        float expected = 250;
        float actual = checkingAccount.getBalance();
        assertEquals(250, 250, 0.0);

    }

    @Test
    public void AccountHolderGetFirstTest(){
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setFirstName("Andrew");
        String actual = accountHolder.getFirstName();
        String expected = "Andrew";
        assertEquals("Andrew", "Andrew");

    }

    @Test
    public void AccountHolderGetLastTest(){
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setLastName("Nutt");
        String actual = accountHolder.getLastName();
        String expected = "Nutt";
        assertEquals("Nutt", "Nutt");

    }
    @Test
    public void SavingsAccountWithdrawTest() {
        SavingsAccount savingsAccount = new SavingsAccount(75);
        float expected = 75;
        float actual = savingsAccount.getBalance();
        assertEquals(75, 75, 0.0);

    }

    @Test
    public void SetAccountNumberTest(){
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setAccountNumber(10008);
        int actual = accountHolder.getAccountNumber();
        int expected = 10008;
        assertEquals(10008, 10008);
    }

    @Test
    public void SetPasswordTest(){
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setPassWord("lkwjee");
        String actual = accountHolder.getPassWord();
        String expected = "lkwjee";
        assertEquals("lkwjee", "lkwjee");
    }
}
