package MultiThredingconcepts.ThredingConcepte.TraficSignels;

public enum TraficColor {

    RED(9000) , YELLOW(2000) , GREEN(5000);

    private final int onLightTime;

    public int getOnLightTime() {
        return onLightTime;
    }

    private TraficColor(int onLightTime) {
        this.onLightTime = onLightTime;
    }
}
