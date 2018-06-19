package ex2;

/**
 * Created by lihanqing3 on 2017/11/21.
 */
public class Account {
    protected  double balance;

    public Account(double balance) {
        this.balance = balance;
}

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public  void withdraw(double amount){
        if (balance<amount)
        { System.out.println("余额不足");
            return;}
        balance-=amount;

    }
    public  void deposit(double amount){
        balance+=amount;

    }

}
