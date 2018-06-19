package ex3;

import org.junit.Test;

import javax.faces.event.PostPutFlashValueEvent;
import javax.swing.*;
import java.util.*;

/**
 * Created by lihanqing3 on 2017/11/23.
 * 1.不使用泛型
 * 集合中的元素不安全，可以放任何引用类型对象
 * 取出来都是Object类型，具体操作可能要强转，这时肯呢个转换异常
 *
 *
 */
public class GenericTest {
@Test
public void testGenericAndEctends(){
    Object[] objs=new Object[10];
    Person[] persons=new Person[10];
    //Object是person父类，数组也是它的父类
    objs=persons;

    List<Object> objectList=new ArrayList<>();
    List<Person> personList=new ArrayList<>();

   // objectList=personList;
    //object是person父类，但是其list却不是其父类
    //因为personlist只能获取到person类型对象

}



    @Test
    public void testGenericClass(){
        Dao<Person> dao=new Dao<>();
        Person p=new Person();
        dao.save(p);
    }


@Test
    public void  testCollectionEithGenric(){
        Set<Person> persons=new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                return -o1.getAge()+o2.getAge();
            }
        });

        persons.add(new Person("aa",12));
        persons.add(new Person("aa1",122));
        persons.add(new Person("aa2",123));
        persons.add(new Person("aa3",124));
        persons.add(new Person("aa4",125));
       Iterator<Person> it=persons.iterator();
       while (it.hasNext())
       {
           Person person=it.next();
           System.out.println(person);
       }

    }

    @Test
    public void helloGeneric(){
        List<Person> persons=new ArrayList<Person>();

        persons.add(new Person("aa",12));
        persons.add(new Person("aa1",12));
        persons.add(new Person("aa2",12));
        persons.add(new Person("aa3",12));
        persons.add(new Person("aa4",12));
        persons.add(new Student());
       // persons.add("abcd");



        for (int i = 0; i <persons.size() ; i++) {

            Object obj=persons.get(i);
            Person  person=(Person) obj;


            System.out.println(obj);
        }

    }
}
