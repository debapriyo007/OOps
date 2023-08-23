
public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("debu");
        Student s3 = new Student(07);
    }
}

class Student{
    String name;
    int roll;

    /*There are 3 types of constructor ---
     
    1.Parameterized
    2.Non- Parameterized
    3.Copy constructor
    */
    
    //2.Non- Parameterized

    Student(){
        System.out.println("Non parameterized calling...");
    }

    // 1.Parameterized
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }

    //Upto this concept is called  "CONSTRUCTOR OVERLODING..."
}
