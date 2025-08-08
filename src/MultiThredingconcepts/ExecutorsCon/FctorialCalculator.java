package MultiThredingconcepts.ExecutorsCon;

import java.util.concurrent.Callable;

public class FctorialCalculator implements Callable <Integer> {
    private final int number;

    public FctorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        if (number <= 2) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i < number; i++) {
            result *= i;
        }

        return result;
    }

}
