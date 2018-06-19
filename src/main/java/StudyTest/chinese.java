package StudyTest;

/**
 * Created by lihanqing3 on 2017/11/20.
 */
public class chinese {

    private  String country;
    private  String name;
    private  int age;

    @Override
    public String toString() {
        return "chinese{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public chinese(String country, String name, int age) {
        this.country = country;
        this.name = name;
        this.age = age;
    }

    public chinese(){}
}
