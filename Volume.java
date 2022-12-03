package test;
import java.lang.Math.*;

public  class Volume {


    
    public final double pie = Math.PI;

    public static void main(String[] args) {

        Volume shape = new Volume();
        System.out.println("cube volume :"+shape.getVolume(2));
        System.out.println("cuboid volume :"+shape.getVolume(2,3,4));
        System.out.println("cylinder volume :"+shape.getVolume(2,3));
        
    }


    // cube
    public  int  getVolume(int length){
        int volume;

        volume =length*length*length;
        return volume;

    }

    // cuboid
    public  int  getVolume(int length, int breadth, int width){
        int volume;

        volume =length*width*breadth;
        return volume;

    }

    // cylinder
    public  double  getVolume(int radius,int height){
        double volume;

        volume =pie *radius*height;
        return volume;

    }
    
}
