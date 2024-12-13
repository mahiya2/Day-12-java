import java.util.*;
public class Printingusingiterator{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hello");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        Iterator itr=a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
    }
}