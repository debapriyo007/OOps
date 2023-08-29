public class OOPS {
    public static void main(String[] args) {
    //  pawn p1 = new pawn();
    //  p1.moves();

    Bear b1 = new Bear();
        b1.eatgrass();
        b1.eatmeat();
    }
}

/*
interface chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
     public void moves(){
        System.out.println("up , down , right , left, digonal all direction.");
     }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("Up , Down , left , Right");
    }
}

class pawn implements chessPlayer{
    public void moves(){
        System.out.println("1 or 2 step forward");
    }
}*/



/*
 * Implement Interface using multiple Inheritance..
 */

 interface carnivore {
      void eatgrass();
 }

 interface harbivore{
      void eatmeat();
 }

 class Bear implements carnivore , harbivore {
     public void eatgrass(){
        System.out.println("Eatting grass..");
     }

     public void eatmeat(){
        System.out.println("Meat Eatting...........");
     }
 }
