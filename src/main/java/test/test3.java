package test;

import com.sun.org.apache.xpath.internal.SourceTree;
import day3.People;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lihanqing3 on 2017/12/1.
 */
public class test3 {
    private ApplicationContext s;
    @Before
            public void set() throws Exception{
      s=new ClassPathXmlApplicationContext("bean.xml");
    }
@Test
        public void  test(){
    People people=(People) s.getBean("zhangsan2");
    System.out.println(people.toString());}


}
