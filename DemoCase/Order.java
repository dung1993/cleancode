package DemoCase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Order {
    private int idOrder;
    private Customer customer;
    private ArrayList<Product> listProducts;

    public Order() {
    }

    public Order(int idOrder, Customer customer, ArrayList<Product> listProducts) {
        this.idOrder = idOrder;
        this.customer = customer;
        this.listProducts = listProducts;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(ArrayList<Product> listProducts) {
        this.listProducts = listProducts;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", customer=" + customer + "\n" +
                ", listProduct=" + listProducts +
                '}';
    }

    //Câu 1: Tính tồng tiền của order.
    public double totalProduct(int id) {
        double total = 0;
        for (int i = 0; i < listProducts.size(); i++) {
            total += listProducts.get(i).getPrice() * listProducts.get(i).getAmount();
        }
        return total;
    }

    //Câu 2: Xóa sản phẩm khỏi danh sách theo id.
    //- Cách 1:
//    public void removeProductById(int id){
//        for (int i = 0; i < listProduct.size(); i++) {
//            if (listProduct.get(i).getId() == id){
//                listProduct.remove(listProduct.get(i));
//            }
//        }
//    }
    //- Cách 2:
    public void removeProductById(int id) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                Product product = new Product();
                product.setProduct(listProducts.get(i));
                listProducts.remove(product);
            }
        }
    }

    //Câu 3: Sửa tên sản phẩm theo ID
    public void changeProductById(int id, String name) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                listProducts.get(i).setName(name);
            }
        }
    }

    // Sửa giá sản phẩm theo ID
    public void changPriceProductById(int id, double price) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                listProducts.get(i).setPrice(price);
            }
        }
    }

    // Sửa số lượng sản phẩm theo ID
    public void changeAmountProductById(int id, int amount) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                listProducts.get(i).setAmount(amount);
            }
        }
    }

    // Câu 4: Tìm sản phẩm theo tên sản phẩm
    public List<Product> searchProductByName(String name) {
        List<Product> newProducts = new ArrayList<>();
        for (Product product : listProducts) {
            if (product.getName().equalsIgnoreCase(name))
                newProducts.add(product);
        }
        return newProducts;
    }

    // Câu 5: Tìm sản phẩm theo tên san phẩm và mô tả (dùng điều kiện hoặc: or)
    public boolean searchProduct(String name, double price) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getName() == name || listProducts.get(i).getPrice() == price) {
                return true;
            }
        }
        return false;
    }

    // Câu 6: Sắp xếp sản phẩm theo thứ tự từ a-z, giá tiền, số lượng.
    public void sortProductByName(Comparator<Product> myProduct) {
        ComparatorImplName comparatorImplName = new ComparatorImplName();
        listProducts.sort(comparatorImplName);
    }

    public void sortProductByPrice(Comparator<Product> myPrice){
        ComparatorImlpPrice comparatorImlpPrice = new ComparatorImlpPrice();
        listProducts.sort(comparatorImlpPrice);
    }

    public void sortProductByAmount(Comparator<Product> myAmount){
        ComparatorImlpAmount comparatorImlpAmount = new ComparatorImlpAmount();
        listProducts.sort(comparatorImlpAmount);
    }
    //Câu 7: In ra Hóa đơn theo định dạng.

}
