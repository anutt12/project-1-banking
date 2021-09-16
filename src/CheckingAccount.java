public class CheckingAccount implements AccountActions {

    private float balance;


    public CheckingAccount(float balance) {
        this.balance = balance;
    }


    @Override
    public void depositMoney(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdrawalMoney(double amount) {
        this.balance -= amount;
    }

    @Override
    public void transferMoney(double amount) {

    }

    @Override
    public float getBalance() {
        return balance;
    }
}
