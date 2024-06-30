package Opps.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//            divided(a, b);

            String name = "21Savage";
            if(name.equals("21Savage")){
                throw  new MyException("21 21 my own exception.");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Other Exceptions!");
        }finally {
            System.out.println("I'm always run nobody can stop me!");
        }
    }

    // throws is basically declare Exceptions . If you call divided method then it may throws exceptions.
     static int divided(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw  new ArithmeticException("You can't divided a number by 0");
            // throw is basically throw a error.
        }
        return  a/b;
    }
}
