class Humans{
    private int age; //here default age is = 0
    //"Private"  varriable is only accessable inside this class only "Humans" class only
    private String name; //default name is = null

    //we aaccess this "private" variable through some Methords.
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Opps {
    public static void main(String[] args) {
        Humans obj = new Humans();

        // obj.age = 21;
        // obj.name = "Debu";

        obj.setAge(21);
        obj.setName("Debu");
        System.out.println("Name : " + obj.getName() + " Age : " + obj.getAge()); 
        //but ,  What if  i can't share my age
    }
}


