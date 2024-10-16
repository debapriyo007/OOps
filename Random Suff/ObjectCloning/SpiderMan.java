package Opps.ObjectCloning;

public class SpiderMan implements  Cloneable{
    String superPower;
    String city;

    public SpiderMan(String superPower, String city) {
        this.superPower = superPower;
        this.city = city;
    }

    public SpiderMan(SpiderMan other) {
        this.superPower = other.superPower;
        this.city = other.city;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
