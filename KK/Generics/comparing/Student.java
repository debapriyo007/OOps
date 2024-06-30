package Opps.Generics.comparing;

public class Student implements Comparable<Student> {
    int rollNum;
    float marks;

    public Student(int rollNum, float marks) {
        this.rollNum = rollNum;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return  marks + " ";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        //if diff == 0 means both are equal.
        // if diff < 0 means o is bigger.
        // else o is smaller.
        return diff;
    }
}
