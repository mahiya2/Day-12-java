import java.util.*;
public class Printingthellhashset{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hello");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        for(String s:a)
        {
            System.out.println(s+" ");
        }
    }
}