package W6;

import java.util.Comparator;

public class VergelijkOpPrijs implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrijs() > o2.getPrijs()) {

            return -1;
        } else if (o1.getPrijs() < o2.getPrijs()) {
            return 1;
        } else {
            return 0;
        }

    }
}
