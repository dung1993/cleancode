package DemoCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         Customer customer = new Customer(1, "Cường", " 090260456","quoccuong@gmail.com");
         Product product1 = new Product(1, "Revice", 10000, 4);
         Product product2 = new Product(2, "Number1", 12000, 6);
         Product product3 = new Product(3, "Sting", 11000,7);
         Product product4 = new Product(4, "ÔLongTea", 12000, 5);

        ArrayList<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);

        Order order = new Order();
        order.setListProducts(list);
        order.setIdOrder(2);
        order.setCustomer(customer);
//        order.removeProductById(3);
        System.out.println(order);
        order.changeProductById(4,"Water");
        System.out.println(order);
        List<Product> newProduct = order.searchProductByName("Number1");
        System.out.println(Arrays.toString(newProduct.toArray()));
        System.out.print(order.searchProduct("Revice", 10000));
        Comparator<Product> myProduct = new ComparatorImplName();
        order.sortProductByName(myProduct);
        System.out.println(order);
        Comparator<Product> myPrice = new ComparatorImlpPrice();
        order.sortProductByPrice(myPrice);
        System.out.println(order);
        Comparator<Product> myAmount= new ComparatorImlpAmount();
        order.sortProductByAmount(myAmount);
        System.out.println(order);

    }
}
