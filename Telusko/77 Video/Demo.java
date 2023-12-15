
public class Demo {
    public static void main(String[] args) {
       /*  int i = 0; //this is a normal statement.
        int j = 18/i; //this is critical statement.
        System.out.println(j); */

        


       /* int x = 0;
        int y = 18/x; //--> Here Arthematic exceptional is occure . In this line java  Stop the excution .Line number 23 and Line Number 24 never be excute.
        System.out.println(y);
        System.out.println("Hello Jee!!");*/


        int a = 0;
        int b = 0;
        try{
            b = 18/a;
        }catch(Exception e){
            System.out.println("You can't divide a number with Zero (0)");
        }
        System.out.println(b);
        System.out.println("Namaste!!");

    }
}
