public class hybride_Inhei {
    public static void main(String[] args) {
        Parrot p1 =new Parrot();
        p1.eat();
    }
    
}

class Animal{
    public String color;

    public void eat(){
        System.out.println("Eat");
    }

    public void breath(){
        System.out.println("Breathing");
    }
}

class fish extends Animal{
    void swim(){
        System.out.println("Swiming");
    }
}

class Mammals extends Animal{
    void walk (){
        System.out.println("Walking..");
    }
}

class bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}

class GoldeFish extends fish{
    void color(){
        System.out.println("It's gold color.");
    }
}

class Shark extends fish{
    void color(){
        System.out.println("It's gold color.");
    }
}
class Parrot extends bird{
    void color(){
        System.out.println("It's green color.");
    }
}
class dogs extends Mammals{
    void color(){
        System.out.println("It's gray");
    }
}
class cats extends Mammals{
    void eyecolor(){
        System.out.println("It's brown ");
    }
}

