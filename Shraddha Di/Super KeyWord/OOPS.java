
class Employer{
    //property of the employer class..
    String name;
    int emplId;
    int age;

    //constructor of Employ..
    Employer(String name , int emplId , int age){
        this.name = name;
        this.emplId = emplId;
        this.age = age;
    }

    //now display methord..
    public void display(){
        System.out.println("The name of employer is : " + name);
        System.out.println("The age of employer is :" + age);
        System.out.println("The employId is :" + emplId);
    }
}

class Banker extends Employer{
    int salary;
    int wrkHr;

    //now create a constructor..
    Banker(String name , int emplId , int age, int salary , int wrkHr){
        // i am using the super keyword..
        super(name, emplId, age);
        this.salary = salary;
        this.wrkHr = wrkHr;
    }
    
    //Now i complete my display function..
    public void display(){
        // again i am using super keyword.
        super.display();
        System.out.println("Salary is : " + salary* wrkHr);
    }
}

public class OOPS {
    
    public static void main(String[] args) {
        Banker b1 = new Banker("Debu", 0001, 22, 1000, 8);
        b1.display();
    }
}
