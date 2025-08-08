package MultiThredingconcepts.ThredingConcepte.TraficSignels;

public class TestRoad {

    public static void main(String[] args) throws InterruptedException {

    TraficLight red = new TraficLight(TraficColor.RED);
    TraficLight yellow = new TraficLight(TraficColor.YELLOW);
    TraficLight green = new TraficLight(TraficColor.GREEN);
    green.start();
    green.join();
    yellow.start();
    yellow.join();
    red.start();


    }

}
