package ThredingConcepte;

public class JoinmethodThread extends Thread{


    @Override
    public void run() {
        System.out.printf("Starting Thread : %s\n", Thread.currentThread());
        for (char c = 'A'; c <= 'G'; c++) {
            
            System.out.println();
            for (char i = 'a'; i <= 'z'; i++) {
                if ('C' == c) {
                    System.out.print('c' +" ");
                }
                else if (i == 'a' || c == 'A' || i == 'z' || c == 'G') {
                    System.out.print(i + " ");
                } else {
                    System.out.print( "  ");
                }
                

            }
            try {
            Thread.sleep(300);
            } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread was interrupted");
            break;
            }
        }


        
        
    }

}
