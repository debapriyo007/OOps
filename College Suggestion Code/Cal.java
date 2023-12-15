//This my calculation Interface.

Interface Calculation{
    int triple(int n);
}

//Implement cal interface.
class C1 implements Calculation{
    @Override
    public int triple(int n){
        return n*n*n;
    }
} 
class C2 implements Calculation{
    @Override
    public int triple(int n){
        return n*3;
    }
} 
public class Cal {
    Calculation c1 = new C1();
    int resultC1 = c1.triple(5);
    System.out.println("C1 Result: " + resultC1);

    // Using C2
    Calculation c2 = new C2();
    int resultC2 = c2.triple(5);
    System.out.println("C2 Result: " + resultC2);
    
}
