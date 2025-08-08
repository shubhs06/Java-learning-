package MultiThredingconcepts.ExecutorsCon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingalExcutor {
    public static void main(String[] args) {
        ExecutorService execute = Executors.newSingleThreadExecutor();

        Runnable task = new PrintRunanble();

        execute.submit(task);

        execute.shutdown();
    }
}
