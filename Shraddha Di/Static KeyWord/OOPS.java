

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.clgName = "BIT";
        System.out.println(s1.clgName);
        Student s2 = new Student();
        System.out.println( "Second object college name " +s2.clgName); //i can't decleare the second object
        //college but it still printing cause i decleare the clgName Static..
        
        System.out.println(s2.cgpa(90, 88, 100));
    }
}

class Student {
    int roll ;
    String name ;
   static String clgName;

  //Create methord for name..

  void setname(String name){
      this.name = name;
    }

   String getName(){
    return this.name;
   }

   //create a static methord ..

   public static int cgpa(int ai , int oops , int math){
    return (ai+oops+math)/3;
   }

}
