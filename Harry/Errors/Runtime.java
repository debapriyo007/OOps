/* Run Time Error : - 
   A runtime error, also known as a runtime exception, is an error that occurs during the execution of a program. It is typically caused by unexpected or exceptional conditions that were not accounted for in the code. 
*/

public class Runtime {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        // Attempting to divide by zero, causing ArithmeticException
        int result = numerator / denominator;

        System.out.println("Result: " + result);
    }
}
