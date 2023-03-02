
//import java.util.*;
package Cylinder;

// creating class..

 class Cylinder{
    public double radi;
    public double heig;

    // methords

    public double IidArear(){
        return Math.PI*radi*radi;
    }

    public double totalSurfaceArea(){
        return 2*Math.PI*radi*heig+2*Math.PI*radi*radi;
    }

    public double volume(){
        return Math.PI*radi*radi*heig;
    }

 }

public class oops_3 {
    public static void main(String[] args) {

        //Creating an Object..

        Cylinder c = new Cylinder();

        c.heig=10;
        c.radi=5;

        System.out.println("Iid Area ="+c.IidArear());
        System.out.println("Total Surface area ="+c.totalSurfaceArea());
        System.out.println("Volume ="+c.volume());
        
    }
    
}
