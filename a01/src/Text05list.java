import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Text05list {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add("a");
        col.add("bb");
        col.add(111);
        col.add("fff");
        col.add("vvv");
        col.add(111);
        Iterator iterator=col.iterator();
        while (iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }
//        for (Object o:col){
//            System.out.println(o);
//        }

    }
}
