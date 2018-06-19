package ex2;

import com.mchange.v2.log.FallbackMLog;

/**
 * Created by lihanqing3 on 2017/11/21.
 */
public class CheckingAccount extends Account{
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }
    public void setOverdraftProtection(double overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }
    public double getOverdraftProtection() {
        return overdraftProtection;
    }


  @Override
    public void withdraw(double imt)
  {
      //余额够
      if (balance>=imt)
      { balance-=imt;

      }
      else {
          //透支保护足够
          if (overdraftProtection>=(imt-balance)) {
              overdraftProtection -= (imt - balance);
              balance=0;
          }
          else
          {
              System.out.println("余额不足");
          }

      }

  }


}
