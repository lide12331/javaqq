import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Text012thread {
    public static void main(String[] args) {
        Ss s=new Ss();
        Thread thread=new Thread(s);
        thread.start();
        D d=new D();
        FutureTask futureTask = new FutureTask<>(d);
        Thread thread1=new Thread(futureTask);
        thread1.start();


    }
}
class Ss implements Runnable{

    @Override
    public void run() {
        System.out.println("线程ss");
    }
}
class D implements Callable{

    @Override
    public Object call() throws Exception {
        System.out.println("线程D");
        return null;
    }
}
