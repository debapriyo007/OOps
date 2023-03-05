// package Static_Key;
import java.util.*;;

public class type {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.schoolName="jharia Sri Ramkrishna Vidyapith(H.S)";

        Student s2= new Student();
        System.out.println(s2.schoolName);

    }
    
}

class Student{
    public String name;
    public int roll;

    static String schoolName;

    void setName(String name){
        this.name= name;
    }

    String getName(){
        return this.name;
    }


}
