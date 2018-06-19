package Circle;

/**
 * Created by lihanqing3 on 2017/11/20.
 */
public class ComparableCircle extends a_circle implements ComparableObject {


     @Override
    public int compareTo(Object o)
    {
        if(o instanceof a_circle)
        {
            a_circle c=(a_circle) o;
            return (int)(this.r-c.getR());
        }

        return 0;
    }

}
