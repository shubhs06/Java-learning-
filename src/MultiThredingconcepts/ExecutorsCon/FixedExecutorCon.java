package MultiThredingconcepts.ExecutorsCon;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedExecutorCon {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);

        Runnable task1 = new PrintRunnnble();
        Runnable task2 = new PrintRunnnble();
        Runnable task3 = new PrintRunnnble();
        Runnable task4 = new PrintRunnnble();

        ex.submit(task1);
        ex.submit(task2);
        ex.submit(task3);
        ex.submit(task4);
        ex.shutdown();
    }

}
