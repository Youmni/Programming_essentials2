package W6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Sortering productLijst = new Sortering(true);

        productLijst.sorteerLijstWatches();
        productLijst.sorteerLijstPhones();

        for (Product lijst : productLijst.getSmartphones()) {
            System.out.println(lijst.getMerknaam());
        }

    }
}
