package StudyTest;


import java.security.PublicKey;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by lihanqing3 on 2017/11/20.
 */
public class testSingle {

   /* public static void main(String[] args) {
    //    Single single1=new Single();
    //    Single single2=new Single();
        Single instance1=Single.getInstance();
        Single instance2=Single.getInstance();

        System.out.println(instance1==instance2);

    Single instance3=Single.getInstance();
        System.out.println(instance3);

    }*/

    public static void main(String[] args) {
        Random random = new Random();
        final List<Person> people = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            people.add(new Person("test" + i, random.nextInt()));
        }
        System.out.println(people);
        System.out.println("运用一下LAMBA表达式");
        TESTLAMBA testlamba = person-> person.getAge()<100;
        filter(people,person-> person.getAge()<100);
        filter(people,TESTLAMBA::testHero);
    }
    private static void filter(List<Person> people,TESTLAMBA testlamba) {
        for (Person hp : people) {
            if(testlamba.test(hp))
                System.out.print(hp);
        }
    }


}
