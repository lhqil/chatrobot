package Circle;

/**
 * Created by lihanqing3 on 2017/11/20.
 */
public class a_circle {
    protected   double  r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public a_circle(double r) {
        this.r = r;
    }

    public a_circle(){

    }

    public  double findArea(){
        return Math.PI*this.r*this.r;
    }


}
