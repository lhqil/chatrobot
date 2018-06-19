package day2;

import StudyTest.Person;
import sun.plugin2.message.Message;

/**
 * Created by lihanqing3 on 2017/11/21.
 */
public class testInstance {

    public static void main(String[] args) {

        testInstance ti=new testInstance();

       Person1 p1= new Person1();
       Student student=new Student();
       Graduate graduate=new Graduate();

       ti.test(p1);
        ti.test(student);
        ti.test(graduate);



    }
    public  void test(Person1 o){
        String info=o.getInfo();
        System.out.println(info);


        if (o instanceof Person1)
            System.out.println("a person");
         if (o instanceof Student)
             System.out.println("a student");
        if (o instanceof Graduate)
            System.out.println("a graduate");

    }



}
class Person1 {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
class Student extends Person1 {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }

}
class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}