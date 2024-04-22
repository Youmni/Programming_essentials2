package W6;

public enum NummerPlaat {
    PLAAT_1("ABC-123"),
    PLAAT_2("DEF-456"),
    PLAAT_3("GHI-789"),
    PLAAT_4("JKL-012"),
    PLAAT_5("MNO-345"),
    PLAAT_6("PQR-678"),
    PLAAT_7("STU-901"),
    PLAAT_8("VWX-234"),
    PLAAT_9("YZA-567");

    private String nummerplaat;

    NummerPlaat(String nummerplaat) {
        this.nummerplaat = nummerplaat;
    }

    public String getNummerplaat() {
        return nummerplaat;
    }
}
