class Computer{

    public void musicPlayer(){
        System.out.println("Play Some Music..");
    }

    public String getPen(int cost){
        if(cost >= 10){
            return "Pen is Expensive";
        }else{
            return "Nothing.";
        }
        
    }
}
public class Opps {
    public static void main(String[] args) {
        /*
        As we did't write any methord but 
        default there is a methord called Main
        we are using that methord anyway.
        */

        Computer c1 = new Computer();
        c1.musicPlayer();
        System.out.println(c1.getPen(13));
    
    }
}
