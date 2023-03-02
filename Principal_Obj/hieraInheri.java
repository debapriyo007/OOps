public class hieraInheri {
    public static void main(String[] args) {
    Mammals raa = new Mammals();  //obj 1
    raa.eat();

    bird parr = new bird();  // obj 2
    parr.eat();
        
    }
    
}

//Base class...
class Animal{
    public String color;

    public void eat(){
        System.out.println("Eat");
    }
    public void breath(){
        System.out.println("Breath");
    }
}
//Derive class...
class Mammals extends Animal{
    void walk(){
        System.out.println("Malmmas can walks");
    }
}

//derive class
class bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}

//derive class
class fish extends Animal{
    void swim(){
        System.out.println("swiming");
    }
}

