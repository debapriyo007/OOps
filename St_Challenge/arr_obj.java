

//import java.util.*;
//package St_Challenge;

//import javax.security.auth.Subject;

class subject{
    public String subId;
    public String name;
    public int maxMarks;
    public int maxObtain;


    //properties.....
    public String  getSubID(){
        return subId;
    }
    public String getName(){
        return name;
    }

    public int getmaxMarks(){
        return maxMarks;
    }

    public int getmaxObtain(){
        return maxObtain;
    }

    //setx part

    public void  setmaxMarks(int m){

       maxMarks=m;
    }
    public void  setmaxObtain(int n){
        maxObtain=n;
    }

    public boolean isQulify(){
        return maxObtain>=maxMarks/10*4;
    }

    public String toString(){
        return "\nSubjectId:"+subId+"\nName:"+name+"\nMarksObtain:"+maxObtain;
    }
    



    //constructor...

    public subject(String subId , String name, int maxObtain){
        this.subId= subId;
        this.name= name;
        this.maxObtain=maxObtain;
    }
}

public class arr_obj {
    public static void main(String[] args) {
       subject sub[]= new subject[3];
       sub[0]= new subject("pcc-192","Opearating System", 97);
       sub[1]= new subject("cs-85","Algorithim ",99);
       sub[2]= new subject("bsc-404","Analog",70);

       
       for(subject s:sub){//for loop sort sort version....
         System.out.println(s);
       }
        
    }
    
}
