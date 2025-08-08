package MultiThredingconcepts.ExecutorsCon;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedExecutorTermi {
    public static void main(String[] args) {
        try (ExecutorService ex = Executors.newFixedThreadPool(3)) {

            for (int i = 0; i < 10; i++) {
                Runnable task1 = new PrintRunnnble();
                ex.submit(task1);
            }
            ex.shutdown();


                if (!ex.awaitTermination(10, TimeUnit.SECONDS)) {
                    System.out.println("Emergency SHUTDOWN");
                    ex.shutdownNow();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
    }

}
