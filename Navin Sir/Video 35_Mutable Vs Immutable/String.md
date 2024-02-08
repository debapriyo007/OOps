```java
public class Opps {
    public static void main(String[] args) {
        String s1 = "Debu";
        String s2 = "Debu";

        /* Now thik how many object are created behind the scene
         If you think 2 object created  -> then you are wrong!!!

        We got Two ref in Stack but in total only one object created in Heap.*/

        System.out.println(s1 == s2); //true the address of s1 and s2 are same
        //means both are pointing to same object in heap


        //Inside your heap memory thre is a special area called "String Constant Pool"

        /* 
         * EVERY STRING WHAT YOU USE IN JAVA THEY ARE CONSTANT.
         * YOU CAN'T CHANGE THEM.
         *  
        */

        // I am declare a varrible 
        String name = "Virat";
        /*
        
        when we are excute the line number 24 . So need "Virat" variable
        Do we have "Virat" in the String Constant Pool?
        No we don't have it. Let's create it. it's holde a address.
        and the name variable acctually get that address.

        */




        String name1 = "MS"; //this line will create a object in heap and a ref(name1) hold address in stack address is 101.
        
        //here we can't change the data of "MS" MS is still in the String Constant Pool.

        name1 = name1 + "Dhoni"; //this line creating a new Object  in heap ,which will have a data "MSDhoni" and  there is a address on that object.
        //suppose address is 105

        //now change the name1 ref address from 101 to 105.(YOU ARE JUST CHANGING THE ADDRESS !!NOT ACCTUALLY CHANGING THE DATA
        // YOU ARE BASCIALLY CREATING A NEW OBJECT..

        //then you will think what happen with MS object in heap?
        // --> The garbage collector will come and clean the MS object from the heap.



        //Here There is Concept come ---
        // 1. MUTABLE ---> Changeable.
        // 2. IMMUTABLE ---> Not Changeable.

        //By default String is Immutable.


        //What Happen If You want Mutable String?
        // --> That's why there are two class in Java 

        // 1. StringBuffer
        // 2. StringBuilder

        //Both are provide how to implement the mutable string.


    }
}




```