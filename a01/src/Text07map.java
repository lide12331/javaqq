import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Text07map {
    public static void main(String[] args) {
        Map map=new HashMap<>();
        map.put(11,"mm");
        map.put("kk",14);
        map.put("jj",44);
        map.put(15,"kk");
        map.put(11,"ll");
        map.put(89,"kk");
        Set set=map.keySet();
        for (Object i:set){
            System.out.println(i);
        }
        Set set1=map.entrySet();
        for (Object o:set1){
            System.out.println(o);
        }
    }
}
