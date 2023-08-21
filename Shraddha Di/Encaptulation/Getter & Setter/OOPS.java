public class OOPS {
    public static void main(String[] args) {
        Pen  p1 = new Pen();
        p1.setcolor("Blue");
        System.out.println(p1.getcolor());

        p1.settip(12);
        System.out.println(p1.gettip());
    }
}

class Pen{
    private String color;
    private int tip;

    void setcolor(String color){  //this is my setter who set the color of my pen..
        this.color = color;
    }

    String getcolor(){   //I can get the color which i set.
        return this.color;
    }

    void settip(int tip){
        this.tip = tip;
    }

    int gettip(){
        return this.tip;
    }
}