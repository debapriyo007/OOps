public class OOPS {
    public static void main(String[] args) {

         /* ---- This is for single level Inheritance -----
         
         Fish katla = new Fish();
         katla.eat(); */

         /* ----- This is for Multi level Inheritance ------
         
         Dog  pitbull = new Dog();
         pitbull.eat();
         pitbull.legs = 4;
         System.out.println( "Pitbull have " + pitbull.legs+ " leges.");
         pitbull.walk();*/
   
        /*------ This is for Hierarchical Inheritance  ------

        Bird kakatua = new Bird();
        kakatua.eat();*/



    }
}

/*(1) -------This is "SINGLE LEVEL INHERITANCE"---------
                      ______________
                     |  BASE CLASS  |
                      --------------
                            |
                            |
                            V
                       ______________
                      |  DERIVE CLASS  |
                        --------------


This is my base class..
class Animal{
    String color;
    
    //Methord.
    void eat(){
        System.out.println("Eatting..");
    }

    void breathe(){
        System.out.println("Breathe..");
    }
}

//This is Derive class..

class Fish extends Animal{
    int fins;
    void swiming(){
        System.out.println("Fish are swiming in water.");
    }
}*/



/*(2) -------This is "MULTI LEVEL INHERITANCE"---------
                      ______________
                     |  BASE CLASS  |
                      --------------
                            |
                            |
                            V
                       ______________
                      |  DERIVE CLASS |
                        --------------
                             |
                             |
                             V
                       ______________
                      |  DERIVE CLASS |
                        --------------  

//Base class.
class Animal{
     String color;
    
    //Methord.
    void eat(){
        System.out.println("Eatting..");
    }

    void breathe(){
        System.out.println("Breathe..");
    }
}

//Derive class 1.
class Mammals extends Animal{
    //property .
    int legs;

    //methord..
    void walk(){
        System.out.println("Walking...");
    }
}

//Derive class 2.

class Dog extends Mammals{
    String bread; //property..

    //methord..
    void barking(){
        System.out.println("Dogs are barking..");
    }

}*/


/*(3) -------This is "Hierarchical Inheritance"---------
                      ______________
                     |  BASE CLASS  |
                      --------------
                        /       \
                       /         \
                      /           \
             ______________        ______________ 
            | DERIVE CLASS |      | DERIVE CLASS |
             --------------        --------------
                     
                     

//Base class.
class Animal{
     String color;
    
    //Methord.
    void eat(){
        System.out.println("Eatting..");
    }

    void breathe(){
        System.out.println("Breathe..");
    }
}

//Derive class 1.
class Mammals extends Animal{
    //property .
    int legs;

    //methord..
    void walk(){
        System.out.println("Walking...");
    }
}

//Derive class 2.
class Bird extends Animal{
    int wings;
    void fly(){
        System.out.println("Flying..");
    }
}

//Derive class 2.

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swiming..");
    }
} 
*/



/*(4) -------This is "Hybrid Inheritance"---
 
                       ______________
                      |  BASE CLASS  | {ANIMAL}
                       --------------
                        /          \
                       /            \
                      /              \
                   {FISH}           {BIRD}      
             ______________         ______________ 
            | DERIVE CLASS |        | DERIVE CLASS |
             --------------          --------------
              /         \                    \
             /           \                    \
            /             \                    \
     _____________     ______________      ______________ 
    | DERIVE CLASS |   | DERIVE CLASS |   |  DRIVE CLASS |
     --------------     --------------     ----------------
     {SHARK}            {GOLD FISH}           {HORNBILL}
*/


                        



