package Opps.ObjectCloning.Shallow_Copy_And_DeepCopy;

import java.util.Arrays;

class Test implements  Cloneable{
    int[]arr;

    Test(){
        this.arr = new int[]{3, 4, 5, 6};
    }
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        // this is shallow copy.
//        return super.clone();
//    }
        @Override
    public Object clone() throws CloneNotSupportedException{
            // Now apply deep Copy.
            Test copyArr = (Test)super.clone(); //this is nothing but shallow copy.

            //Now make deep copy.
            copyArr.arr = new int[copyArr.arr.length];
            for(int i = 0;i<copyArr.arr.length;i++){
                copyArr.arr[i] = this.arr[i];
            }
            return copyArr;
    }

}
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test orgArr = new Test();
        //now clone the object.
        Test copyArr = (Test)orgArr.clone();  // cloning the first object t1
        System.out.println(Arrays.toString(orgArr.arr));

        copyArr.arr[0] = 100; // here i change my copy array 0 th index.
        // it should be changed in copy array we all know that.
        // but it's also be change the original array as well  -> THIS IS CALLED "SHALLOW COPY"

       System.out.println(Arrays.toString(copyArr.arr)); // here change everybody knows.
        System.out.println(Arrays.toString(orgArr.arr)); // but at same time it's also change the original array.

    }

}
