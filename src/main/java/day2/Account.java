package day2;

/**
 * Created by lihanqing3 on 2017/11/21.
 */
public class Account {
    private int id;
    protected   double balance;
    private  double annulInteresrRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnulInteresrRate() {
        return annulInteresrRate;
    }

    public void setAnnulInteresrRate(double annulInteresrRate) {
        this.annulInteresrRate = annulInteresrRate;
    }

    public Account(int id, double balance, double annulInteresrRate) {
        this.id = id;
        this.balance = balance;
        this.annulInteresrRate = annulInteresrRate;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annulInteresrRate=" + annulInteresrRate +
                '}';
    }
    public  double getMonthlyInterest(){
        return annulInteresrRate/12;

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
