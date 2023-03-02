public class inheri {
    public static void main(String[] args) {

        fish goldeFish = new fish();
        goldeFish.eat();
        
    }
    
}


//base class...
class Animal{
    public String color;

    public void eat(){
        System.out.println("eat");
    }

    public void breath(){
        System.out.println("Breath");
    }
}
  

//derive class...
class fish extends Animal{
    public int fins;

    public void swim(){
        System.out.println("Swiming..");

    }
}



