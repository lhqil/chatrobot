package StudyTest;

import javax.print.attribute.standard.PrinterURI;

/**
 * Created by lihanqing3 on 2017/11/20.
 */
public class Person {


    private String name;
    private int age;

    {
        age = 10;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
