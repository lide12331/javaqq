import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Text06set {
    public static void main(String[] args) {
        Set set=new HashSet<>();
        set.add("1");
        set.add("ccc");
        set.add(121);
        set.add("kkk");
        set.add("vvv");
        set.add("ddd");
        set.add(121);
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }
//        for (Object o:set){
//            System.out.println(o);
//        }
    }
}
