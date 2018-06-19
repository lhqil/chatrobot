package StudyTest;

/**
 * Created by lihanqing3 on 2017/11/20.
 *
 *
 */
public class Single {
   private Single(){}
    //在类的外部不能创建类的实例
    //为了让类的外部使用要用static修饰
    //不能在类的外部修改这个属性；私有化这个属性提供共有方法访问
 private static  Single  instance=new Single();

    public static Single getInstance() {
        return instance;
    }
}
