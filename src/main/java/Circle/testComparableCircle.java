package Circle;

/**
 * Created by lihanqing3 on 2017/11/20.
 */
public class testComparableCircle {
    public static void main(String[] args) {
        ComparableCircle c1=new ComparableCircle();
        c1.setR(4);
        ComparableCircle c2=new ComparableCircle();
        c2.setR(7);
        System.out.println(c1.compareTo(c2));
    }


}
