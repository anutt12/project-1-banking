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
    public void withdrawalMoney(float amount) {
        this.balance -= amount;
    }

    @Override
    public float getBalance() {
        return balance;
    }
}
