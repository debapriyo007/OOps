//import java.util.*;
package Constructor;

class rectrangle{

    private double len;
    private double bre;

    //creating constructor..

    public rectrangle(){
        len=1;
        bre=1;
    }

    public rectrangle(double l, double b){
      setLength(l);
      setBreath(b);
    }

    public rectrangle(double s){
        len=bre=s;

    }

    //creating property...

    public double getlenght(){
        return len;
    }

    public double getbreath(){
        return bre;
    }

    public double setLength(double l){
        if(l>=0){
            return len=l;
        }else{
            return len=0;
        }
    }

    public double setBreath(double b){
        if(b>=0){
            return bre=b;
        }else{
            return bre=0;
        }
    }

    // creating methords

    public double area(){
        return getlenght()*getbreath();
    }

    public double perimeter(){
        return 2*(len+bre);
    }

    public boolean isSqure(){
        if(len==bre){
            return true;
        }else{
            return false;
        }
    }

}


public class rectangleTest {
    public static void main(String[] args) {

        //creating object..
        rectrangle r =new rectrangle(10,5);
        System.out.println("Area = "+r.area());
        
    }
    
}
