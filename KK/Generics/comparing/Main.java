package Opps.Generics.comparing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student debu = new Student(21, 81.99f);
        Student ms = new Student(7, 91.99f);
        Student subham = new Student(9, 98.99f);
        Student sachin = new Student(10, 70.99f);
        Student sunil = new Student(12,31.99f);


        Student[] list = {debu, ms, subham, sachin, sunil};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return - (int)(o1.marks - o2.marks);
            }
        });

        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));
        //you can also write in this way.

        System.out.println(Arrays.toString(list));

//        if(debu.compareTo(ms) < 0){
//            System.out.println(debu.compareTo(ms));
//            System.out.println("Ms got more marks..");
//        }
    }
}
