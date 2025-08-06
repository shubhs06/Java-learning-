package ThredingConcepte;

public class PrintingTreads extends Thread {

    @Override
    public void run() {
        // TODO Auto-generated method stub

        for (int i = 1; i <= 10; i++) {
            
            System.out.printf("%d Hello from Therad %d  %s \n",i,noThread ,Thread.currentThread());
            
        }
        System.out.println(getState());
    }

    
        private final int noThread;
    
        public PrintingTreads(int noThread) {
            this.noThread = noThread;        
    }    

    

}
