package Opps.ObjectCloning;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        SpiderMan tobey = new SpiderMan("SuperHuman", "New York");
        
        //twin 1
        SpiderMan andrew = new SpiderMan(tobey);

        //instated of doing the above , u can also do this way also-
        //(Spider-Man) is for type-cast.
        SpiderMan tomHolland  = (SpiderMan)tobey.clone();
        
        System.out.println("Tom Holland city: " + tomHolland.city);
        System.out.println("Tom Holland superpower: " + tomHolland.superPower);
    }
}
