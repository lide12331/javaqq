import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Text013pool {
    public static void main(String[] args) {
//        ExecutorService pool= Executors.newFixedThreadPool(5);
//        ExecutorService pool=Executors.newCachedThreadPool();
//        ExecutorService pool=Executors.newScheduledThreadPool(5);
        ExecutorService pool=Executors.newSingleThreadExecutor();
        for (int i=0;i<20;i++){
            int finalI = i;
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getId()+"===="+ finalI);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
        pool.shutdown();
    }
}
