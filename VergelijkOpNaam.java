package W6;

import java.util.Comparator;

public class VergelijkOpNaam implements Comparator <Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getMerknaam().compareTo(o2.getMerknaam());
    }
}
