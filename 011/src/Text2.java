import java.sql.Array;
import java.util.Random;



public class Text2 {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(a.length);
        int b=3;
        String s1="jjjj";
        System.out.println(s1.hashCode());
        s1="mmm";

        System.out.println(s1.hashCode());
        System.out.println(s1.charAt(1));
        System.out.println(s1.toUpperCase());
        String s2="jjjj";
        System.out.println(s1==s2);
        s2="lll";
        System.out.println(s1==s2);
        System.out.println(s1);
        String s3=new String("jjjj");
        System.out.println(s1==s3);
        System.out.println("========================");

        String s11="lmlm";
        System.out.println(s11.hashCode());
        s11+="kk";
        System.out.println(s11.hashCode());
        StringBuffer s4=new StringBuffer("kkkk");
        System.out.println(s4);
        StringBuffer s41=new StringBuffer("kkkk");
        System.out.println(s4==s41);
        StringBuffer s44=s4.append("ee");
        System.out.println(s44==s4);
        StringBuilder s5=new StringBuilder("kkkk");
        s5.append("rr");

        System.out.println("*************************");
        Integer i=8;
        int k=i+3;
        System.out.println(k);
        Random r=new Random();
        System.out.println(r.nextInt(50));

    }
}
