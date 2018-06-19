package ex2;

import sun.management.counter.perf.PerfInstrumentation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lihanqing3 on 2017/11/21.
 */
public class Customer {
    private  String firstname;
    private  String lastname;
 //  private Account[] accounts;
    private List<Account> accounts;
   // private  int numberofAccounts;

    public int getNumberofAccounts() {

        //return numberofAccounts;
        return accounts.size();
    }
    /*public void setNumberofAccounts(int numberofAccounts) {
        this.numberofAccounts = numberofAccounts;
    }*/
  public void addAccount(Account account)
  {
    //  accounts[numberofAccounts++]=account;
      accounts.add(account);
  }


  public Account getAccount(int index){
     //   return accounts[index];
      return accounts.get(index);
  }



    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
       // accounts=new Account[2];
        accounts=new ArrayList<>();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


}
