package test;

import day3.JavaWork;
import day3.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lihanqing3 on 2017/12/1.
 */
public class test2 {
    public static void main(String[] args) {
        ApplicationContext s=new ClassPathXmlApplicationContext("bean.xml");
        JavaWork javaWork= (JavaWork) s.getBean("javawork");
        javaWork.doTest();
        People people=(People) s.getBean("people");


        System.out.println(people.toString());
    }

}
