
class Mobile{
    String brand;
    int price;
    static String name;


    public void printDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Name: "+name);
    }

    public static void printDetails2(){
        System.out.println("Brand: "+ brand); //you can't use a non-static variable inside static methord.
        System.out.println("Price: "+ price);
        System.out.println("Name: "+name); //here we are use coz our name is static variable.
    }
}



public class Opps {

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand  = "Apple";
        m1.price = 69999;
        Mobile.name = "Smart Phone";


        Mobile m3 = new Mobile();
        m3.brand  = "OnePluse";
        m3.price = 100000;
        Mobile.name = "Smart Phone";


        Mobile m2 = new Mobile();
        m2.brand  = "Samsung";
        m2.price = 99999;
        Mobile.name = "Smart Phone";

        //call the printDetails methord.
        m1.printDetails();



        Mobile.printDetails2(); //when you write Mobile.printDetails it the methord getting confuse which object you 
        //talk about.

        //from where the "brand" and "price " belong form m1, m2 . it may be m1 or m2 that's why there is a confusion
        // a non static variable can't directly access by static methord

    }
}


// When ever you work with an "Non Static Methord" make sure you have to create an object and the call it.
