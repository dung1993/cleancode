package DemoCase;

public class Customer {
    private int idCustomer;
    private String name;
    private String phone;
    private String email;

    public Customer(){};

    public Customer(int idCustomer, String name, String phone, String email) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
