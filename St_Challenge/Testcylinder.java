//import java.util.*;
package St_Challenge;

class cylinder {
    private double radius;
    private double height;

    // creating properties...

    public double getheight() {
        return height;
    }

    public void setheight(double h) {
        if (h > 0) {
            height = h;
        } else {
            height = 0;
        }
    }

    public double getradius() {
        return radius;
    }

    public void setradius(double r) {
        if (r > 0) {
            radius = r;
        } else {
            radius = 0;
        }
    }

    public void dimension(double r, double h) {
        radius = r;
        height = h;
    }

    // creating contructor...
    public cylinder() {
        radius = 1;
        height = 1;
    }

    public cylinder(double radius) {
        height = 1; // when anyone pass only radius in object then the height is automatic 1.
    }

    public cylinder(double r, double h) {
        setheight(h);
        setradius(r);
    }


    
    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double drumArea() {
        return 2 * lidArea() + perimeter() * height;
    }

    public double volume() {
        return lidArea() * height;
    }

}

public class Testcylinder {
    public static void main(String[] args) {
        // Calling the constructor...
        // cylinder c= new cylinder(2,7);

        // using getx and setx.
        cylinder c = new cylinder();
        c.setheight(2);
        c.setradius(10);
        c.dimension(8, 9);


        System.out.println("LidArea = "+c.lidArea());
        System.out.println("Circumference = "+c.perimeter());
        System.out.println("totalSurfaceArea = "+c.drumArea());
        System.out.println("Volume = "+c.volume());
        System.out.println("Height ="+c.getheight());
        System.out.println("Radius ="+c.getradius());

    }

}
