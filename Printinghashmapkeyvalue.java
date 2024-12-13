import java.util.*;
public class Printinghashmapkeyvalue{
    public static void main(String[] args) {
        HashMap<String,String> a=new HashMap<>();
        a.put("SNo","01");
        a.put("Sname","muraja");
        System.out.println(a);
        if(a.containsKey("Sname"))
        {
            String d=a.get("Sname");
            System.out.println(d);
        }
    }
}
