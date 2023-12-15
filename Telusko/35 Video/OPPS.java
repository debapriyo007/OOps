/* 35 Mutable vs Immutable String in Java */ 
public class OPPS {
    public static void main(String[] args) {
       String name = "Debu";
       name = name + " Das";
       System.out.println(name);
       String s1 = "Suuu";
       String s2 = "Ronaldo";
       System.out.println(s1 == s2);
    }
}
