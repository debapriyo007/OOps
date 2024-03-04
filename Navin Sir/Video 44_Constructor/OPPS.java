class Human {
    private String name;
    private int age;


    //Now the concept of Constructor came.
    //Constructor is looking the methord its self.

    Human(){
        name = "Debu";
        age = 21;
    }

    //def: Constructor is a special type of methord which has same name as class name.
    //Constructor has no return anything.

    //Methord overloading
    //-> When we have same name Methord with different parameter.



    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }


}

public class OPPS {
    public static void main(String[] args) {
        
        //Creating constructor.
        Human h1 = new Human();   // like we don't call constructor, it's called automatically when we create object of class.
        Human h2 = new Human();
        //befor intitlize something i print the value of h1
        System.out.println("Name : " + h1.getName() + " Age : " + h1.getAge());

        //and then i intilize the value of h1
        // h1.setName("Debu");
        // h1.setAge(21);
        //and then i print the value of h1
        // System.out.println("Name : " + h1.getName() + " Age : " + h1.getAge());
    }
}
