package Opps.Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaFun {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<5;i++){
            arr.add(i+1);
        }
//        arr.forEach((item) -> System.out.println(item*2)); //one line lamda function
        // item rep each elem in the arraylist.

        // the same thing we do using consumer type functions.
        Consumer<Integer> fun = (item) -> System.out.println(item*2);
//        arr.forEach(fun);

        Operation sum = (a, b) -> a+b;
        Operation pro = (a, b) -> a*b;
        Operation sub = (a, b) -> a-b;


        LamdaFun myCal = new LamdaFun();
        System.out.println(myCal.operate(4,5,sum));
        System.out.println(myCal.operate(4,5,pro));
        System.out.println(myCal.operate(14,5,sub));


    }
    private  int operate(int a , int b, Operation op){
        return op.operation(a, b);
    }
}

//if u wanna do with multiple parameter.
interface Operation{
    int operation(int a, int b);
}
