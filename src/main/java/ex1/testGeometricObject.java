package ex1;

/**
 * Created by lihanqing3 on 2017/11/21.
 */
public class testGeometricObject {

    public boolean equalsArea(GeometriObject o1, GeometriObject o2) {
        return o1.findArea() == o2.findArea();

    }
    public void diaplayGeomteriObject(GeometriObject o)
    {
        System.out.println("area:"+o.findArea());
    }



    public static void main(String[] args) {
        testGeometricObject t=new testGeometricObject();

        Circle c1=new Circle("",0,2);
        Circle c2=new Circle("",0,2);

        boolean result=t.equalsArea(c1,c2);
        System.out.println(result);
        t.diaplayGeomteriObject(c1);

        MyRectangle mr=new MyRectangle("",0,2,2);
        t.diaplayGeomteriObject(mr);



    }


}
