public class OOPS {
    public static void main(String[] args) {
        //create an object of my account..
        Bankaccount b1 = new Bankaccount();
        b1.username = "debu07";
        b1.password = "8888" ; //we can't  use the pass property because it's private you use that in the class.

        //now any user set the password..
        b1.setPassword("8888");

    }
}

class Bankaccount{
    public String username;
    private String password;

    public void setPassword(String password){
        this.password = password;
    }

}
