public class Opps {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Debu ");
        //Initial capacity of StringBuffer is 16 byte.
        //but hrere we are passing a string "Debu" which is 4 byte.
        //now capacity of StringBuffer is 16+4=20 byte.
        System.out.println(sb.capacity()); //20 byte.
        sb.append("is good boy");

        sb.insert(5, "Love Java ");
        sb.ensureCapacity(30); 
        System.out.println(sb);
        
        

        //we want to convet a string into StringBuffer
        //but we can't do like this

        // String str = sb; 

        //we can't do like this because we can't convert a StringBuffer into String directly.
        //we have to use toString() method to convert a StringBuffer into String.
        // String  str = sb.toString();


        //String Buffer is thread safe.
        // and StringBulider is not thread safe.
        
    }
}
