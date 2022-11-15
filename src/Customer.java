public class Customer {
    private static int CUSTOMER_COUNT = 0;
    private int customer_number;
    String customerName;
    Address address;

    public Customer(String a, Address b) {
        setName(a);
        this.customerName = getName();
        setAdress(b);
        this.address = getAdress();
        this.customer_number = getCustomerNumber();
        UpdateCount();
    }

    public void setName(String c) {
        this.customerName = c;
    }

    public String getName() {
        return this.customerName;
    }

    public void setAdress(Address a) {
        address = a;
    }

    public Address getAdress() {
        return this.address;
    }

    public int getCustomerNumber() {
        this.customer_number = CUSTOMER_COUNT;
        return customer_number;
    }

    private static void UpdateCount() {
        CUSTOMER_COUNT += 1;
    }
}
