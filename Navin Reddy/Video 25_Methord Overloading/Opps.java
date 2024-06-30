class Calculator{

    //This concept is called Methord Overloading.
    //Similar function name with different parameter.
    public int add(int num1, int num2){
        return num1+num2;
    }


    public int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }

}

public class Opps {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
       System.out.println(c1.add(23, 1)); 
       System.out.println(c1.add(23, 1, 34)); 
      
    }
}
