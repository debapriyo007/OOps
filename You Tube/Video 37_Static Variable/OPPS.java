

class Mobile{
    String brand;
    int price;
    String netWork;

     //See What i want ? 
     // --> I want to the instance varriable "name" same for all the object.

     //What i do , i just make the varriable static.
     static String name;

    public void printDetails(){ //In Non static method i can use the static varriable.
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Network: "+netWork);
        System.out.println("Name: "+name);
    }


     
}

public class OPPS {
    public static void main(String[] args) {
        
        //creating Obj.
        Mobile obj = new Mobile();
        obj.brand = "Samsung";
        obj.price = 15000;
        // obj.name = "Smartphone";
        //instaed of calling throug ref i also called through "class" name("THAT'S THE BEAUTY OF JAVA").
        Mobile.name = "Smartphone";


        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 10000;
        Mobile.name = "Smartphone"; //i can also change the name through class name.


        //Now create another object.
        Mobile obj2 = new Mobile();
        obj2.brand = "OnePlus";
        obj2.price = 20000;
        Mobile.name = "Smartphone";  //i can also change the name through class name.


        //now what i do ..
        // i just change the obj1 name.
        Mobile.name = "KeyPad Phone";
        //now the the name will be change for all the object.
        //because the  of static keyword.

        obj.printDetails();
        obj1.printDetails();

    }

    //What IS  Static Keyword ?
    //-->  You are making some thing as a class member not as a object member.

    //like in above moblie class i make the "name" as a static.
    // so it belongs to the class not to the object.
    //that's why i can change the name through class name in main method. 

    // Mobile.name = "Smartphone";  ("This line")
    
}
