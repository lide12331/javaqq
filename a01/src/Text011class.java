import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Text011class {
    public static void main(String[] args) {
        try {
            Class c=Class.forName("Uu");

            Field[] field=c.getDeclaredFields();
            for (Field field1:field){
                System.out.println(field1.getName());
                System.out.println(field1.getType().getSimpleName());
            }
            Method[] method=c.getDeclaredMethods();
            for (Method method1:method){
                System.out.println(method1.getName());
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
class Uu{
    private String name;
    private int age;

    public Uu() {
    }

    public Uu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public boolean uu(int i){
        return i==11;
    }
}
