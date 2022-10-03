package DemoCase;

import java.util.Comparator;

public class ComparatorImlpAmount implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getAmount() < product2.getAmount()){
            return 1;
        }else {
            if (product1.getAmount() == product2.getAmount()){
                return 0;
            }else {
                return -1;
            }
        }
    }
}
