class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class Opps {
    public static void main(String[] args) {
        int num1  = 9;
        int num2  = 6;
        Calculator cal = new Calculator();
        int res = cal.add(num1,num2);
        System.out.println(res);
    }
}
