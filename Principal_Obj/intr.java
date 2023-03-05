public class intr {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
        
    }
    
}
interface ChessPlayer{
    void move();
}

class King implements ChessPlayer{
    public void move(){
        System.out.println("King can move up down left right");
    }
}

class Queen implements ChessPlayer{
    public void move(){
        System.out.println("Queen ncan move multiple direction");
    }
}
class Rook implements ChessPlayer{
    public void move(){
        System.out.println("Rook up down ");
    }
}
