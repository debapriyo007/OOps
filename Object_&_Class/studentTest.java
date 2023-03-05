import special_keyword.Student;

//package Student;
// import java.util.*;

// creating class

class Student{
    public int roll;
    public String name;
    public String courseName;
    public int m1, m2, m3;


    public int total(){
        return m1+m2+m3;
    }

    public float avg(){
        return (float)total()/3;
    }

    public char grade(){
        if(avg()>=70){
            return 'A';
        }
        else{
            return 'B';
        }

    }

    public String details(){
        return "Roll:"+roll+"\n"+"Name:"+name+"\n"+"Coure Name:"+courseName+"\n";
    }
}

public class studentTest {
    public static void main(String[] args) {
        
        Student s1= new Student();
        s1.roll=1;
        s1.name="Raa";
        s1.courseName="Beat prod.";
        s1.m1=90;
        s1.m2=75;
        s1.m3=80; 

        System.out.println("The student details is:\n"+s1.details());
        System.out.println("Total number out of 300: "+s1.total());
        System.out.println("Average is: "+s1.avg());
        System.out.println("Grade is: "+s1.grade());
        
        
    }
    
}
