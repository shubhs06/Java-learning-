package MultiThredingconcepts.ThredingConcepte;

public class Testing {
    public static void main(String[] args) throws InterruptedException {
        // PrintingTreads t1 = new PrintingTreads(1); 
        // PrintingTreads t2 = new PrintingTreads(2);
        
        // t1.start();
        // t2.start();

        Statechecking c1 = new Statechecking();

        System.out.printf("creation state %s \n",c1.getState());
        c1.start();
        c1.join();
        System.out.printf("Ending state %s \n",c1.getState());

        
        

    }
}
