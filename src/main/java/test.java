import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lihanqing3 on 2017/12/1.
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext s=new ClassPathXmlApplicationContext("bean.xml");
       HelloWorld helloWorld= (HelloWorld) s.getBean("helloworld");
        helloWorld.say();
    }

}
