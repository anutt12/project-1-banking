public class SavingsAccount implements AccountActions{

    private float balance;

    public SavingsAccount(float balance) {
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
