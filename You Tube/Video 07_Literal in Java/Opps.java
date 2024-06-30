
public class Opps {

    public static void main(String[] args) {
        int num  = 9;

        //This are called Literals.
        //The above value is in decimal value.
        //What happen if i do with binary value ?
        int num1  = 0b101;
        System.out.println(num1);


        /* What happen if i put may zero in a number how do i figure out that. */
        int num2 = 10_00_00_00; // i'm using _(underscore)
        System.out.println(num2);


        //WHAT ABOUT CHARACTER?!
        char c = 'a'; //this is all litreals.
        //Now character can also be treated as integer.
        c++;
        System.out.println(c);
        

    }
}