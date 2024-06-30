class Mobile{

    String brand;
    int price;
    static String name;


   
    //creating a constructor.
    Mobile(){
        //This are the default value 
        brand = "";
        price = 200;
        System.out.println("Constructor is Calling........");
    }

     //as my name is static variable this will same for all Object 
    //so i declear that in static block and initilize that.
    static{ //STATIC BLOCK ALWAYS CALLED  FIRST.
        name = "Phone";
        System.out.println("The Static Block is Calling.......... ");
    }





    public void printDetails(){
        System.out.println(" Brand :" + brand
                        +  " \n Price :" + price
                        +  "\n Name : " + name);
    }
}

public class Opps {
    public static void main(String[] args) throws ClassNotFoundException {
        //1st Object..
        // Mobile m1 = new Mobile();
        // m1.brand = "Apple";
        // m1.price = 69999;
        // Mobile.name = "Smart Phone";
        
        // m1.printDetails();



        //2nd Object.
        // Mobile m2 = new Mobile();


        //wITH OUT CREATING OBJECT WE WANT OT LOAD THE CLASS.
        //AND EXCUTE THE STATIC BLOCK CODE.
        Class.forName("Mobile");

    }
}


/*
 * Every Time When we create Object there are two steps --->
 
 * 1. Class Load.
 * 2. Objects are Instiantiated.
  
     //Class only loads onace.
     //you have a special area  Class Loader.--> This will contain all the classes which are loaded.
     //The class are loaded from your libary to "Loader" (It will happens only onace.)

    
     //EveryTime you load a class it will called the static block .

     //So, Class Loading first that's why it's called the "Static Block" First.
     then , It will create the object ..that's why it called the constructor after static block.
     //now no matter now how many object you created right now. "THE CLASS IS ALREADY LOADED NOW."



     //WHAT HAPPEN IF I DON'T CREATE ANY OBJECT ?

     --> Ofcourse it's does't call any constructor.
     -->  "So Static Block also not call."


     WHAT HAPPEN IF I'M CREATING ANY OBJECT ? 
     * IF I DONT CREATE ANY OBJECT THE CLASS DOES'T LOAD.
     * 
     * BUT WITHOUT CREATING ANY OBJECT CAN WE LOAD THE CLASS ?
     * --> YES .
     * FOR THAT , THERE IS A SPECIAL CLASS
     * 


 */


 //"STATIC BLOCK" IS USE TO INTILIZED THE STATIC VARRIABLES.