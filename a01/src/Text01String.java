public class Text01String {
    public static void main(String[] args) {
        String a="abcd";
        String b="ab"+"cd";
        String c="ab";
        String d="cd";
        String s=c+d;
        String s1=new String("abcd");
        System.out.println(a==b);
        System.out.println(a==s);
        System.out.println(a==s1);
        byte[] b1=a.getBytes();
        System.out.println(b1);
        char c1=a.charAt(2);
        System.out.println(c1);
        int s2=a.length();
        System.out.println(s2);
        int s3=a.compareTo(b);
        System.out.println(s3);
        boolean s4=a.isEmpty();
        System.out.println(s4);
        System.out.println("==================");
        String m="aca";
        StringBuffer m1=new StringBuffer("ac");
        StringBuffer m2=m1.append("a");


    }
}
