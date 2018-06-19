package day2;

/**
 * Created by lihanqing3 on 2017/11/21.
 */
public class CheckAccount extends Account{
    private  double overdraft;

    public CheckAccount(int id, double balance, double annulInteresrRate, double overdraft) {
        super(id, balance, annulInteresrRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void  withdraw(double amount){
        if (balance>=amount)
            balance-=amount;
        else if(overdraft>=(amount-balance)){
            overdraft-=amount-balance;
            balance=0;
        }else
        {
            System.out.println("超出可透支限额");

        }

    }
}
