package MultiThredingconcepts.ExecutorsCon;

public class PrintRunnnble implements Runnable {

    @Override
    public void run() {
        System.out.printf(" \nStarted Thread Name %s ",Thread.currentThread().getName());
        try {
            Thread.sleep(((int)Math.random() * 5 + 1) * 10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.printf(" \nEnded Thread Name %s ",Thread.currentThread().getName());
    }
}
