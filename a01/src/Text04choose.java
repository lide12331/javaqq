public class Text04choose {
    public static void main(String[] args) {

        int[] a={1,55,6,99,101,3,45,7};
        choose(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static int[] choose(int[] a){
        for (int i=0;i<a.length-1;i++){
            int x=i;
            for (int j=i+1;j<a.length;j++){
//                System.out.println(j);
                if (a[x]>a[j]){
                    x=j;
                }
            }
            if (x!=i){
                int c=a[x];
                a[x]=a[i];
                a[i]=c;
            }
        }
       return a;
    }
}
