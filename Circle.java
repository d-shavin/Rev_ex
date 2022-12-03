package test;
import java.lang.Math.*;

public class Circle {
    
   protected  double radius;
    protected double area;
    protected double circumference;

    // class Circle constructor

    public Circle(double radius){
        this.radius = radius;
    }
    public final  double getArea(double radius) {
        area = Math.PI*radius*radius;
        return area;
    }
    public  final double getCircumference(double radius) {

        circumference = Math.PI*2*radius;
        return circumference;
    }

    public static void main(String[] args) {
        Circle circleA = new Circle(45);
     System.out.println("circumference :"+circleA.getCircumference(45));   //demo values radius 45.0
     System.out.println("area" + circleA.getArea(45.0));   
    }
}
