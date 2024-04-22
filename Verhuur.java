package W6;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Verhuur{
    Auto wagen1 = new Auto("Audi", "A3");
    Auto wagen2 = new Auto("BMW", "X5");
    Auto wagen3 = new Auto("Mercedes-Benz", "E-Klasse");
    Auto wagen4 = new Auto("Toyota", "Corolla");
    Auto wagen5 = new Auto("Ford", "Focus");
    Auto wagen6 = new Auto("Volkswagen", "Golf");
    Auto wagen7 = new Auto("Tesla", "Model S");


    TreeMap<NummerPlaat, Auto> heelContract = new TreeMap<>();

    public Verhuur(){
        heelContract.put(NummerPlaat.PLAAT_1, wagen1);
        heelContract.put(NummerPlaat.PLAAT_2, wagen2);
        heelContract.put(NummerPlaat.PLAAT_3, wagen3);
        heelContract.put(NummerPlaat.PLAAT_4, wagen4);
        heelContract.put(NummerPlaat.PLAAT_5, wagen5);
        heelContract.put(NummerPlaat.PLAAT_6, wagen6);
        heelContract.put(NummerPlaat.PLAAT_7, wagen7);
    }

}
