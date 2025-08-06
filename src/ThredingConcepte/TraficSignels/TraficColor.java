package ThredingConcepte.TraficSignels;

public enum TraficColor {

    RED(3000) , YELLOW(500) , GREEN(5000);

    private final int onLightTime;

    public int getOnLightTime() {
        return onLightTime;
    }

    private TraficColor(int onLightTime) {
        this.onLightTime = onLightTime;
    }
}
