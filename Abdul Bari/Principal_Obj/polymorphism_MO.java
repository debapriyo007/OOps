public class polymorphism_MO {
    public static void main(String[] args) {
        // Calculator cal = new Calculator();
        // System.out.println("sum ="+ cal.sum(2, 3));
        // System.out.println("sum ="+ cal.sum((float)1.50,(float) 2.20));
        // System.out.println("sum ="+ cal.sum(1, 2, 3));
        
        Cow c =new Cow();
        c.eat();
        
    }
    
}

//Methord Overloding...
class Calculator{


    int sum(int a, int b ){
        return a+b;
    }

    float sum (float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}


//Over Riding....
class Animal{
    public void eat(){
        System.out.println("Eat anything...");
    }
}

class Cow extends Animal{
    public void eat(){
        System.out.println("Eat grass");
    }
}
