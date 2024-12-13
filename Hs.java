import java.util.*;
public class Hs{
    public static void main(String args[]){
        LinkedHashset<String> a=new LinkedHashset<>();
        a.add("hello");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        System.out.println(a);
        a.remove("rajesh");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}