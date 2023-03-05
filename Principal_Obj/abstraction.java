public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        chicken c =new chicken();
        c.eat();
        c.walk();
        
    }
    
}

abstract class Animal{      //an abstract class can't be created as an object...
    public void eat(){
        System.out.println("Animal Eat");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
           System.out.println("The horse has 4 legs");
    }
} 

class chicken extends Animal{
    void walk(){
        System.out.println("Chicken has 2 legs");
    }
}

