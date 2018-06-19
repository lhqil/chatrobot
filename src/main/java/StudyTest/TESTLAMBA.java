package StudyTest;

import java.net.PortUnreachableException;

/**
 * Created by lihanqing3 on 2018/5/31.
 */
public interface TESTLAMBA {
    public boolean test(Person person);
    public static boolean testHero(Person person) {
        return person.getAge()<100;
    }
}
