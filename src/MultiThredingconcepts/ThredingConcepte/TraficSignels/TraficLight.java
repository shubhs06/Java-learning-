package MultiThredingconcepts.ThredingConcepte.TraficSignels;

public class TraficLight extends Thread {

    private final TraficColor color;

    public TraficLight(TraficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        
        System.out.printf("%s Activate \n",color );
        try {
            Thread.sleep(color.getOnLightTime());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.printf("Exception is Interrupted %s" ,e.getMessage());
        }
        System.out.printf("%s inactive now \n",color );

    }





}
