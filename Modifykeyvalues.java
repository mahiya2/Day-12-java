import java.util.*;
public class Modifykeyvalues{
    public static void main(String[] args) {
        HashMap<String,String> a=new HashMap<>();
        a.put("SNo","01");
        a.put("Sname","muraja");
        System.out.println(a);
        //modifying value for a key
        a.put("SNo","90");
        System.out.println(a);
        //removing key in a hashmap
        a.remove("SName");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}
