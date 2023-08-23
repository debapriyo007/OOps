

public class COPY_C {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "debu";
        s1.roll = 07;
        s1.password = "dec@1233";
        //Now set s1 marks..
        s1.marks[0] =90;
        s1.marks[1] =80;
        s1.marks[2] =99;


        //creating another object s2. In s2 object i copy all property from s1 object.
        Student s2 = new Student(s1);  //Copy
        //but i change the password for s2 object..
        s2.password = "oct980@123";

        /* Here i change s1 marks. but at the same time s2 marks are also change..
         Because , when i write in constructor  "  this.marks = s1.marks; " means it's copy the
         array referance .. Referance means it's s2 object does't create any array it's refer the array which
         s1 created..
        */ 
        s1.marks[1] =100;


        //Now i check my s1 marks are copied in s2 or not for the print s2 marks.
        for(int i = 0 ;i<3 ;i++){
            System.out.println("Marks of s2 object :" + s2.marks[i]);
        }

    }
}

class Student{

    //properties..
    String name;
    int roll;
    String password;
    //each student have their marks..
    int marks[];

    /*Copy constructor
     
    This Copy is Know as "SHALLOW COPY".
    Here the changes are reflected..

    Student (Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }*/

    // DEEP COPY CONSTRUCTOR...
     Student (Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0 ;i<marks.length ;i++){
            this.marks[i] = s1.marks[i];
        }
    }
    

    Student(){
        System.out.println("Non parameterized calling...");
        marks = new int[3];
    }
   
    /* 

    // 1.Parameterized
    Student(String name){
        this.name = name;
        marks = new int[3];
    }
    Student(int roll){
        this.roll = roll;
        marks = new int[3];
    } */

}
