/*POLYMORPHISM ----> "POLY" Means many , "MORPHISM" -->forms 
 There are two types of polymorphism --

  1.COMPILE TIME POLYMORPHISM.( Called Static also )
  * Methord Overriding.
    --Multiple methords with same name but different parameter.

  2.RUN TIME POLYMORPHISM.   (Called Dynamic also)
  * Methord Overloading.
    -- Parent and Child class both are contain same function with a different definition..
 
 


*/

public class OOPS {
    public static void main(String[] args) {
        /*  This portion is for Mehord OverLoading ----*/
        
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2, 3));
        System.out.println(cal.sum((float)2.5, (float)2.5));
        System.out.println(cal.sum(10, 20, 30));  

      /* Below portion is for Mehord OverRiding...
      When we create child class object the it will call child class methord only*/
       Cow ranu = new Cow();
        ranu.eat();;
    }
}




/*   This phenomena known as "Mehord OverLoading"...
    That is COMPILE Time polymorphisim..
*/

class Calculator{
    
    //methords..

    int sum (int a , int b){
        return a + b;
    }

    float sum (float a , float b){
        return a + b;
    }

    int sum(int a , int b , int c){
        return a+b+c;
    }
}

/*   Below phenomena known as "Mehord OverRiding"...
    That is RUN Time polymorphisim..
*/

//Derive class
class Animal {
    
    //methord ..
    void eat(){
        System.out.println("eatting ...");
    }
}

class Cow extends Animal{
    void eat(){
        System.out.println("Eatting Grass...");
    }
}
 
