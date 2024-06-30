


package Opps.Generics;

import java.util.*;

public class WildcardExample<T extends Number> { //here T should be a Number or it's SubClass

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //the size is also work as index value.

    public WildcardExample() { //constructor.
        this.data = new Object[DEFAULT_SIZE];
    }

    //THIS IS THE EXAMPLE OF WILDCARD.
    public  void getList(List<? extends  Number>list){

        //do some op.

        // public  void getList(List<Number>list)
        //so when you call that fun you can only pass the Number type
        // you can't pass Numbers subclass

        //if you wanna do that write this way -
        // public  void getList(List<? extends Number>list) --> This is called wild card.
    }


    //now create add method.
    public void add(T num) {
        if (this.isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] tem = new Object[data.length * 2];
        //copy the current item in the tem array.
        for (int i = 0; i < data.length; i++) {
            tem[i] = data[i];
        }
        //now my new data.
        data = tem;
    }

    private boolean isFull() {
        return size == data.length;
    }


    //Remove method.
    public T remove() {
        T remove = (T) (data[size--]); //smaller type to bigger type. so need to typecast
        return remove;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data) +
                ", [ size = " + size + " ]";
    }

    public static void main(String[] args) {

        WildcardExample<Integer> list = new WildcardExample<>();
       for(int i = 0;i<5;i++){
           list.add(2*i);
       }
        System.out.println(list);
    }


}


