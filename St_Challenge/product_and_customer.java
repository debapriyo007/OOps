//import java.util.*;
package St_Challenge;

class product {

    // properties...
    public String iteamNo;
    public String name;
    public float price;
    public int qnty;

    // poperty Methord...

    public String getitemNo() {
        return iteamNo;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQnty() {
        return qnty;
    }

    // setter for price only..

    public void setPrice(float pri) {
        if (pri > 0) {
            price = pri;
        } else {
            price = 0;
        }
    }

    public void setQnty(int qntty) {
        if (qntty > 0) {
            qnty = qntty;
        } else {
            qnty = 0;
        }
    }

    // Constructor...
    public product(String itmNo) {
        this.iteamNo = itmNo;

    }

    public product(String itmNo, String Name) {

        this.iteamNo = itmNo;
        this.name = Name;

    }

    public product(String itmNo, String Name, float price, int qnty) {

        this.iteamNo = itmNo;
        this.name = Name;
        setPrice(price);
        setQnty(qnty);

    }

}



//Customer class..........


class Customer {
    private String custId;
    private String name;
    private String address;
    private String phno;

    public Customer(String custId, String name) {
        this.custId = custId;
        this.address = name;
    }

    public Customer(String custId, String name, String address, String phno) {
        this.custId = custId;
        this.address = name;
        setAddress(address);
        setPhno(phno);
    }

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}

public class product_and_customer {
    public static void main(String[] args) {

    }

}
