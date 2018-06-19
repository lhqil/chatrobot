package ex2;

/**
 * Created by lihanqing3 on 2017/11/21.
 */
public class testBanking {
    public static void main(String[] args) {
   Bank bank=new Bank();
   Customer customer;

   bank.addCustomer("li","han");
   customer=bank.getCustomer(0);
   customer.addAccount(new SavingAccount(500,0.05));
   customer.addAccount(new CheckingAccount(1000,200));

   bank.addCustomer("li","jun");
   customer=bank.getCustomer(1);
   customer.addAccount(new SavingAccount(1000,0.04));
   customer.addAccount(new CheckingAccount(2000,5000));

   bank.addCustomer("li","baobao");
   customer=bank.getCustomer(2);
   customer.addAccount(bank.getCustomer(1).getAccount(0));
   customer.addAccount(bank.getCustomer(1).getAccount(1));


        for (int i = 0; i < bank.getNumberofCustomers(); i++) {
            customer=bank.getCustomer(i);
            if (customer.getFirstname().toString()==""||customer==null)
            {
               return;


            }
            else
            {

                System.out.println();
                System.out.println(customer.getFirstname().toString()+customer.getLastname().toString());

                for (int j = 0; j < customer.getNumberofAccounts(); j++) {
                    Account account=customer.getAccount(j);
                    System.out.println( account.getBalance());    ;


                }



            }


        }

    }

}
