package ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lihanqing3 on 2017/11/21.
 */
public class Bank {
   // private Customer[] customers;
    private List<Customer> customers;
   // private int numberofCustomers;
    public  Bank(){
      //  customers=new Customer[5];
        customers=new ArrayList<>();
    }

    public void  addCustomer(String f,String l){
      /*  Customer customer=new Customer(f,l);
        customers[numberofCustomers]=customer;
        numberofCustomers++;*/
        customers.add(new Customer(f,l));

    }
    public Customer  getCustomer(int index){

        //return customers[index];
        return customers.get(index);
}
    public int getNumberofCustomers() {
       // return numberofCustomers;
        return customers.size();
    }

   /* public void setNumberofCustomers(int numberofCustomers) {
        this.numberofCustomers = numberofCustomers;
    }*/
}
