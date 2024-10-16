package Opps.Generics;
import  java.util.*;

public class OwnArrayList {

    /*@
    How an array list internally work ? Suppose it has some size if the half of it's
    size is full then it's size became twice. this kinda concept is use.
    */
    private int[]data;
    private  static int DEFAULT_SIZE = 10;
    private  int size = 0; //the size is also work as index value.

     public OwnArrayList(){ //constructor.
            this.data = new int[DEFAULT_SIZE];
     }

     //now create add method.
    public void add(int num){
         if(this.isFull()){
             resize();
         }
         data[size++] = num;
    }

    private void resize() {
         int[]tem = new int[data.length * 2];
         //copy the current item in the tem array.
        for(int i = 0;i<data.length;i++){
            tem[i] = data[i];
        }
        //now my new data.
        data = tem;
    }

    private boolean isFull(){
         return size == data.length;
    }


    //Remove method.
    public int remove(){
         int remove = data[size--];
         return remove;
    }

    public  int get(int index){
         return data[index];
    }

    public  int size(){
         return size;
    }
    public  void set(int index, int value){
         data[index]  = value;
    }

    @Override
    public String toString() {
        return "OwnArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

//        ArrayList list = new ArrayList();

        OwnArrayList list = new OwnArrayList();
//        list.add(21);
//        list.add(22);
//        list.add(23);
//        list.add(24);

        for(int i = 0;i<14;i++){
            list.add(i*3);
        }
        System.out.println(list);

        /* What ever we are create mean this arrayList our OwnArrayList this is
         * only store the integer in that list.
         * CAN WE STORE STRING , CHARACTER OR OTHERS DATA TYPE ? NO WE CAN'T
         * Here Generic Concept Comes!!!*/


        /*

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add("Debu")
        * Your requirement is Integer you add String "<Integer>" this is known as generics.
        * Generic provides you  "PARAMETERIZE TYPES" to add.

        */

        /*
        * If we are creating like this-
        * ArrayList list = new ArrayList() //here there is no TYPE safety.
        * anybody can add anything in the list.
        * we can't add primitives in generics like bellow -
              ArrayList<int> list2 = new ArrayList<>();
        * */


    }
}
