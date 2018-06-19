package ex4;

import org.junit.Test;
import org.springframework.aop.scope.ScopedProxyUtils;
import sun.util.calendar.BaseCalendar;
import sun.util.calendar.LocalGregorianCalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by lihanqing3 on 2017/11/24.
 * stringBuilfer，stringBuffer是可以被修改的字符序列
 */
public class testClass {

    @Test
    public void testAppend(){

        StringBuilder stringBuilder=new StringBuilder();//常用
        stringBuilder.append("<html>")
                .append("<body>");
        System.out.println(stringBuilder);
    }
@Test
public void testSimpleDateFormat() throws ParseException {
        DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
     Date date=new Date();
    System.out.println(dateFormat.format(date));
    String datestr="1990-12-12 12:12:12";
    Date date2=dateFormat.parse(datestr);
    System.out.println(date2);

}
@Test
public void RandomTest(){
    Random random=new Random();

  //  System.out.println(random.nextInt());
    System.out.println(random.nextInt(10));
    System.out.println();
}



    @Test
    public void testDateFormat(){

        DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.LONG ,DateFormat.SHORT);
        Date date=new Date();
        String datestr=dateFormat.format(date);
        System.out.println(datestr);

    }

@Test
public void testDate(){
    Date date=new Date();
    System.out.println(date);


}

    @Test
    public void  testStringBuilder(){
        StringBuffer stringBuffer=new StringBuffer("lihanqinggggg");
        System.out.println(stringBuffer);
        stringBuffer.replace(1,3,"hq");
        System.out.println(stringBuffer);

    }

}
