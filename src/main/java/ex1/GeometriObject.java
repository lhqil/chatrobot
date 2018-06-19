package ex1;

/**
 * Created by lihanqing3 on 2017/11/21.
 */
public class GeometriObject {
    protected String color;
    protected double weight;
    public GeometriObject(){

    }

    public GeometriObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public  double findArea(){
      return 0;
    }

}
