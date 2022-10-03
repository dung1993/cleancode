package DemoCase;

import java.util.Comparator;

public class ComparatorImplName implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if(p1.getName().compareToIgnoreCase(p2.getName())>0){
            return 1;
        }else{
            if(p1.getName().compareTo(p2.getName())==0){
                return 0;
            }else{
                return -1;
            }
        }
    }
}
