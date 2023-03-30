public class Text02dichotomy {
    public static void main(String[] args) {

        int[] a={1,5,8,11,18,55,67,99,150};
        int m=cz(a,5);
        System.out.println(m);

    }
    public static int cz(int[] a,int b){
        int k=0;
        int e=a.length-1;
        while (k<=e) {
            int z=(k+e)/2;
            if (b == a[z]) {
                return z;
            } else if (a[z] < b) {
                k = z + 1;
            } else {
                e = z - 1;
            }
        }
        return -1;
    }
}
