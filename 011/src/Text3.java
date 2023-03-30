import java.util.*;

public class Text3 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("ll");
        c.add(55);
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        System.out.println(c);
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
        Map map=new HashMap();
        map.put(null,1);
        Set set = map.keySet();


    }
}
