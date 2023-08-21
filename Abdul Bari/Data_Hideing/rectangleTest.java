package Data_Hideing;
//import java.util.*;

//creating class

class rectangle{

    //properties...
    private int length;
    private int breath;

    //methord...

    //For length part..
    public int getLength(){
        return length;
    }
    public int setLength(int l){
        if(l>0){
            return length=l;
        }else{
            return length=0;
        }
    }

    //for breath part...

    public int getBreath(){
        return breath;
    }

    public int setBreath(int b ){
        if(b>0){
            return breath=b;
        }else{
            return breath=0;
        }
    }

    //Methords or behavoiurs...

    public int area(){
        return length*breath;
    }

    public int perimeter(){
        return 2*(length+breath);
    }


}

public class rectangleTest {
    public static void main(String[] args) {

        //creating object...

        rectangle r =new rectangle();

        //writing the  & breath
        r.setLength(10);
        r.setBreath(5);

        System.out.println("Area ="+r.area());
        System.out.println("Perimeter ="+r.perimeter());

        //reeading the length & breath...

        System.out.println(r.getLength());
        System.out.println(r.getBreath());
        

    }
}
