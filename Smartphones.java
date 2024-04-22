package W6;

public enum Smartphones {
    XLARGE(960, 720), LARGE(640, 480), NORMAL(470,320), SMALL(426, 320);

    private int lengte;
    private int breedte;

    Smartphones(int lengte, int breedte){
        this.lengte = lengte;
        this.breedte = breedte;
    }
}
