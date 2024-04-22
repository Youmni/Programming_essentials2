package W6;

public class Auto {
    private String merk;
    private String model;
    private double prijs;
    private int serienummer;
    private BrandstofType brandstof;
    private boolean verhuurd;


    public Auto(String merk, String model) {
        this.merk = merk;
        this.model = model;
        this.prijs = Math.floor(Math.random()*1000);
        this.serienummer = (int) Math.floor(Math.random()*10000);
        this.brandstof = BrandstofType.values()[(int) Math.floor(Math.random()*3)];
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public int getSerienummer() {
        return serienummer;
    }

    public void setSerienummer(int serienummer) {
        this.serienummer = serienummer;
    }

    public BrandstofType getBrandstof() {
        return brandstof;
    }


    public void setBrandstof(BrandstofType brandstof) {
        this.brandstof = brandstof;
    }


    public void printContract(){
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Prijs: " + prijs);
        System.out.println("Serienummer: " + serienummer);
        System.out.println("Brandstof: " + brandstof);
    }

    public boolean isVerhuurd() {
        return verhuurd;
    }

    public void setVerhuurd(boolean verhuurd) {
        this.verhuurd = verhuurd;
    }
}
