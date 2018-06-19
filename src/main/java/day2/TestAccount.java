package day2;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by lihanqing3 on 2017/11/21.
 *
 *
 */
public class TestAccount {
    public static void main(String[] args) {
        Account account=new Account(1122,20000,0.045);
        account.withdraw(30000);
        System.out.println("您的余额为："+account.getBalance());
         account.withdraw(2500);
        System.out.println("您的余额为："+account.getBalance());
         account.deposit(3000);
        System.out.println("您的余额为："+account.getBalance());
        System.out.println("月利率为："+account.getAnnulInteresrRate());

        System.out.println();
        CheckAccount checkAccount=new CheckAccount(1122,20000,0.045,5000);

        checkAccount.withdraw(5000);
        System.out.println("你的余额为："+checkAccount.getBalance());

        checkAccount.withdraw(10000);
        System.out.println("你的余额为："+checkAccount.getBalance());


        checkAccount.withdraw(4000);
        System.out.println("你的余额为："+checkAccount.getBalance());
             checkAccount.withdraw(2000);
        System.out.println("你的余额为："+checkAccount.getBalance());
        checkAccount.withdraw(2000);
        System.out.println("你的余额为："+checkAccount.getBalance());
         System.out.println("可透支余额为："+checkAccount.getOverdraft());


    }





}
