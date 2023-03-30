public class Text implements Cloneable{
    private int i;
    public Text() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Text text = (Text) o;

        return i == text.i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    public static void main(String[] args) throws Exception {
        Text t1=new Text();
        t1.setI(7);
        Text t2= (Text) t1.clone();
        System.out.println(t1==t2);
        System.out.println(t2.getI());
        System.out.println("=============");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.equals(t2));
    }
}

