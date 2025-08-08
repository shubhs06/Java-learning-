package MultiThredingconcepts.ExecutorsCon;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestingFactorial {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try (ExecutorService service = Executors.newFixedThreadPool(2)) {
            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i <= 12; i++) {
                FctorialCalculator task = new FctorialCalculator(i);
                list.add(service.submit(task));
            }
            for (Future<Integer> element : list) {
                System.out.printf("Result is : %d \n",element.get());

            service.shutdown();
            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Emergency ShutDown");
                service.shutdownNow();
            }
            }
        }

    }
}
