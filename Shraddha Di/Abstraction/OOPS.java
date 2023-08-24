/* ABSTRACTION :-
   The word "Abstract" means the idea in our mind but that does't exist.
   Hiding the unnecessary details and showing only the important parts of user. 

   Abstraction are 2 types ---
       [1.] Abstract Class:-
        *(i) Can't create any Object of Abstract class.
        *(ii) If i make any class Abstract then inside the class Methords are Abstract or Non-Abstract both can be.
        *(iii) Can have Constructor.


       [2.] Interface:-
 */


public class OOPS {
    public static void main(String[] args) {
        // Horse h1 = new Horse();
        // h1.eat();
        // h1.walk();
        // Duck d1 = new Duck();
        // d1.eat();
        // d1.walk();

        Mustang myHorse = new Mustang();
       /*So here first Base class constructor call then derive class.
         Animal -- > Horse -->Mustang
        */


    }
}

/*First implemet Abstract Class 2 points. */

abstract class Animal{ 
    //constructor..
    Animal(){
        System.out.println("Animal constructor call ..");
    }
     //non abstract methord..
     void eat(){
        System.out.println("Eatting...");
     }

     //abstract methord..
     abstract void  walk(); //Abstract methord are those methord where there is no implementation.
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor call..");
    }
    void walk(){
        System.out.println("Walking with 4 leges.");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor call..");
    }
}

class Duck extends Animal{
    void walk(){
        System.out.println("Walking with 2 legs.");
    }
}
