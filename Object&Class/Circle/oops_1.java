



// create class
class circle{
    public double radius;  // property....

    // methords or behavoiurs...
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double parameter(){
        return 2*Math.PI*radius;
    }

  
}
public class oops_1 {
    public static void main(String[] args) {
        circle c = new circle();    //<-----This is an object....
        circle c1 = new circle();    //<-----This is an another object....




        c.radius =7;
        c1.radius=14;

        
        System.out.println("Arera ="+c.area());
        System.out.println("Parameter="+c.parameter());
        
        
        System.out.println("Arera c1="+c1.area());
        System.out.println("Parameter c1="+c1.parameter());
        
    }

    
}
