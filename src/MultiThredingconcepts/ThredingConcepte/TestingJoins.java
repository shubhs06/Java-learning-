package MultiThredingconcepts.ThredingConcepte;

public class TestingJoins {

    public static void main(String[] args) throws InterruptedException {
        JoinmethodThread j1 = new JoinmethodThread();
        JoinmethodThread j2 = new JoinmethodThread();
        JoinmethodThread j3 = new JoinmethodThread();

        j1.start();
        j1.join();
        System.out.printf("Ending Thread : %s  %s \n", Thread.currentThread(),j1.getName());
        j2.start();
        j2.join();
        System.out.printf("Ending Thread : %s\n", Thread.currentThread());
        j3.start();
        j3.join();
        System.out.printf("Ending Thread : %s\n", Thread.currentThread());

        
    }
}
