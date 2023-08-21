//package Rectangle;
//import java.util.*;

// creating class

class Rectangle {
    // properties...
    public int len;
    public int bre;

    // methords...

    public int area() {
        return len * bre;
    }

    public int perimeter() {
        return 2 * (len + bre);
    }

    public boolean isSqure() {
        if (len == bre) {
            return true;
        } else {
            return false;
        }
    }

}

public class opps_2 {
    public static void main(String[] args) {

        // object creating...
        Rectangle r = new Rectangle();

        r.len = 3;
        r.bre = 2;

        System.out.println("Arera ="+ r.area());
        System.out.println("Perimeter ="+ r.perimeter());
        System.out.println("Is it a squre ? "+ r.isSqure());

    }

}
