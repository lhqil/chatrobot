package StudyTest;

import org.junit.Test;

/**
 * Created by lihanqing3 on 2017/11/20.
 * 字符串是不可变的字符序列
 */
public class commonlei {
    @Test
    public void test(){
        String str;
        str = "ww.audd.com";
       // str=str.replace('d','p');
        str.replace('d','m');
        System.out.println(str);

    }
@Test
public  void  testnewstring(){
        String str1="hello world";
        String str2="hello world";
    System.out.println(str1==str2);
    System.out.println(str1.hashCode());
    System.out.println(str2.hashCode());
    String str3=new String("abcde");
    String str4=new String("abcde");

    System.out.println(str3==str4);
}
@Test
public void testTrim(){
    String str="       ab      cd";
    System.out.println("--"+str+"--");
    str.trim();
    System.out.println(str);
    System.out.println(str.trim());
}
@Test
public  void testSunString(){
    String str="http://www.atuuijj.com/index.jsp?name=jj";
   String str1= str.substring(6);
    System.out.println(str1);
    String str2=str.substring(4,8);
    System.out.println(str2);
}
@Test
public void testcharAT(){
    String str="http://www.atuuijj.com/index.jsp?name=jj";
    System.out.println(str.indexOf("//"));
    System.out.println(str.lastIndexOf("/"));
 int beginidex=str.indexOf("//")+2;
 int endindex=str.lastIndexOf("/");


}
    @Test
    public void testPassRef(){
        Person person=new Person("abc",12);
        System.out.println(person);

        changePerson(person);

        System.out.println(person);
        String str="abcd";
        changeString(str);
        System.out.println(str);


    }
@Test
public  void  testSplit(){
        String str1="a-b-c-d-e-f";
        String[] a=str1.split("-");
        for(String s:a)
        {
            System.out.println(s);
        }
}

public  void changePerson(Person person){
        person.setName("ssssssvvcse");
}
public void  changeString(String str)
{
    str.replace('a','b');
    String reslut=str.replace('a','b');
    System.out.println(reslut);

}

@Test
    public void testPractice(){
    String str1="acmfnz";

    for (int i = 0; i <str1.length() ; i++) {
        char ch = str1.charAt(i);
        if (ch>='a'&&ch<='z')
        {
            if (ch=='z')
                ch='a';
            else
            ch =(char) (1+ch);
        }else if(ch>='A'&&ch<='Z'){
            if (ch=='Z')
                ch='A';
            else
            ch = (char)(1+ch);
        }else{
            System.out.println(ch);
        }
        System.out.println(ch);
    }





}








}
