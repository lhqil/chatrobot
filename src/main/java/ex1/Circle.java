package ex1;

/**
 * Created by lihanqing3 on 2017/11/21.
 */
public class Circle extends GeometriObject {
    private double radius;



    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return  Math.PI*radius*radius;
    }
}
