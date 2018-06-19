package ex2;

/**
 * Created by lihanqing3 on 2017/11/21.
 */
public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
