package W6;

import java.util.*;
public class Sortering {

    private boolean sortNaam;
    private ArrayList<Product> smartphones;
    private ArrayList<Product> smartwatches;


    public Sortering(boolean sortNaam) {
        this.sortNaam = sortNaam;
        smartphones = new ArrayList<>();
        smartwatches = new ArrayList<>();

        smartphones.add(new Product(999.99, "Samsung", 1234, Smartphones.LARGE));
        smartphones.add(new Product(799.99, "Apple", 5678, Smartphones.NORMAL));
        smartphones.add(new Product(699.99, "Google", 91011, Smartphones.SMALL));
        smartphones.add(new Product(1199.99, "OnePlus", 121314, Smartphones.LARGE));
        smartphones.add(new Product(499.99, "Xiaomi", 151617, Smartphones.SMALL));
        smartphones.add(new Product(899.99, "Huawei", 181920, Smartphones.NORMAL));
        smartphones.add(new Product(1099.99, "Sony", 212223, Smartphones.LARGE));

        smartwatches.add(new Product(299.99, "Samsung", 9876, Smartwatches.ROND));
        smartwatches.add(new Product(199.99, "Apple", 5432, Smartwatches.VIERKANT));
        smartwatches.add(new Product(149.99, "Fitbit", 111213, Smartwatches.ROND));
        smartwatches.add(new Product(399.99, "Garmin", 141516, Smartwatches.VIERKANT));
        smartwatches.add(new Product(249.99, "Huawei", 171819, Smartwatches.ROND));
        smartwatches.add(new Product(179.99, "Xiaomi", 202122, Smartwatches.VIERKANT));
        smartwatches.add(new Product(329.99, "Amazfit", 232425, Smartwatches.ROND));
    }


    public void sorteerLijstWatches(){
        if(sortNaam){
            Collections.sort(smartwatches, new VergelijkOpNaam());
        }
        else{
            Collections.sort(smartwatches, new VergelijkOpPrijs());
        }
    }

    public void sorteerLijstPhones(){
        if(sortNaam){
            Collections.sort(smartphones, new VergelijkOpNaam());
        }
        else{
            Collections.sort(smartphones, new VergelijkOpPrijs());
        }
    }

    public boolean isSortNaam() {
        return sortNaam;
    }

    public void setSortNaam(boolean sortNaam) {
        this.sortNaam = sortNaam;
    }

    public ArrayList<Product> getSmartphones() {
        return smartphones;
    }

    public void setSmartphones(ArrayList<Product> smartphones) {
        this.smartphones = smartphones;
    }

    public ArrayList<Product> getSmartwatches() {
        return smartwatches;
    }

    public void setSmartwatches(ArrayList<Product> smartwatches) {
        this.smartwatches = smartwatches;
    }
}
