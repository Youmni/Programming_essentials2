package W6;

public class Product {

    private double prijs;
    private String merknaam;
    private int modelnummer;
    private Smartphones sizePhone;
    private Smartwatches sizeWatch;

    public Product(double prijs, String merknaam, int modelnummer, Smartphones smartphoneSize) {
        this.prijs = prijs;
        this.merknaam = merknaam;
        this.modelnummer = modelnummer;
        this.sizePhone = smartphoneSize;
    }

    public Product(double prijs, String merknaam, int modelnummer, Smartwatches smartwatchSize) {
        this.prijs = prijs;
        this.merknaam = merknaam;
        this.modelnummer = modelnummer;
        this.sizeWatch = smartwatchSize;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String getMerknaam() {
        return merknaam;
    }

    public void setMerknaam(String merknaam) {
        this.merknaam = merknaam;
    }

    public int getModelnummer() {
        return modelnummer;
    }

    public void setModelnummer(int modelnummer) {
        this.modelnummer = modelnummer;
    }
}
