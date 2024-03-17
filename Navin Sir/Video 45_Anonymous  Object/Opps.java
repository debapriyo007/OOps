class A {
    A(){
        System.out.println("Object Created..");
    }
    void print(){
        System.out.println("I love Java");
    }
}

public class Opps {
    public static void main(String[] args) {

        new A(); //this type of object called Anonymous Object

        new A().print(); //this is another Anonymous object.

    }
}
