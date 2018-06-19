package StudyTest;

import sun.management.counter.perf.PerfInstrumentation;

/**
 * Created by lihanqing3 on 2017/11/20.
 */
public class Bank {
    private  int id;
    private  int balance;
    private  String password;


    private static double interestRate;
    private static int minBalance;

    private  static int initId=10000;

public Bank(){

}
    public Bank(int balance, String password) {
        this.id=initId++;
        this.balance = balance;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}
