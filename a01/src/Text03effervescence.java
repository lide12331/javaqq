public class Text03effervescence {
    public static void main(String[] args) {
        int[] a={1,5,22,45,6,8,11};
        effervescence(a);
        for (int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }
    public static int[] effervescence(int[] a){
//        for (int i=a.length-1;i>=0;i--){
//            for (int j=0;j<i;j++){
//                if (a[j]>a[j+1]){
//                    int b=a[j+1];
//                    a[j+1]=a[j];
//                    a[j]=b;
//                }
//            }
//        }
        for (int i=0;i<a.length;i++){
            for (int j=i;j<a.length-1;j++){
                if (a[j]>a[j+1]){
                    int b=a[j+1];
                    a[j+1]=a[j];
                    a[j]=b;

                }
            }
        }
        return a;
    }
}
