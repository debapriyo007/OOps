public class stat {
    public static void main(String[] args) {
       Student s1 =new Student();
       s1.SchoolName= "Jhari Sri Ramkrishna ";
       
       Student s2 = new Student();
       System.out.println(s2.SchoolName);
       
       System.out.println("Student2 percentage = "+s2.returnParcentage(60, 90, 99)+"% ");
    }
    
}
class Student{
    public String name;
    public int roll;

   static int returnParcentage(int math , int phy, int che){
    return (math+phy+che)/3;
   }

    
    static String SchoolName;
    
    void setname(String name){
        this.name=name;
    }

    String getName(){
        return this.name;
    }
}
