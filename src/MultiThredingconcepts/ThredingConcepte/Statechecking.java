package MultiThredingconcepts.ThredingConcepte;

public class Statechecking extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.printf("Current State is %s \n", getState());
        } catch (InterruptedException e) {
            System.out.println("Exception interrupted: " + e.getMessage());
        }
    }

}
