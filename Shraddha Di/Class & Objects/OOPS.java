class OOPS{
    public static void main(String[] args) {
        
        //creating object.
        Pen p1 = new Pen();
        p1.setcolor("Blue");
        System.out.println(p1.color);
        
        p1.setTip(12);
        System.out.println(p1.tip);
        
        p1.setcolor("Black");
        System.out.println(p1.color);
    }
}

//In java class name are start with Capitial letter..
class Pen{
 //The property of my class..
    String color;
    int tip;

    //methord..
    void setcolor(String color){
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}

//This is my anothet student class
class Student{
    int name ;
    int roll;    //my property ..
    float cgpa;
 
   void cgpa(int oops, int ai, int os){  //methord of student class..
    cgpa = (oops+ai+os)/3;
   }

}