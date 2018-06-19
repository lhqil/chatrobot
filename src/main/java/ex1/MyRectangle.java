package ex1;

import ex1.GeometriObject;

/**
 * Created by lihanqing3 on 2017/11/21.
 */
public class MyRectangle extends GeometriObject {
    private  double width;
    private  double height;

    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea(){
        return height*width;
    }

}
