public class multi_Inheri {
    public static void main(String[] args) {

        Dog pithubb = new Dog();
        pithubb.eat();
        pithubb.legs=4;
        System.out.println("Pitbull has "+pithubb.legs+" legs.");
        
    }
    
}

//Base class

class Animal{
    public String color;

    public void eat(){
        System.out.println("eat");

    }

    public void breath(){
        System.out.println("breathing");
    }

}

//derive class

class Mammals extends Animal{
    public int legs;
}

//derive class

class Dog extends Mammals{
    public String breade;
}
