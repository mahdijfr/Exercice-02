import java.time.*;
import java.util.*;

public class Invoice {
    private int state;
    private static float TAX_RATE;
    private Customer customer;
    private LocalDateTime submittime;
    private int totalprice;
    private ArrayList<Item> invoiceItems = new ArrayList<>();
    private int taxfee;
    static {
        TAX_RATE = 0.094f;
    }

    public Invoice(Customer c) {
        this.customer = c;
        this.state = -1;
        this.submittime = LocalDateTime.now();
        this.totalprice = 0;
    }

    public int getState() {
        return state;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getSubmitTime() {
        return submittime;
    }

    public boolean addItem(Item item) {
        if (this.state == -1) {
            invoiceItems.add(item);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeItem(Item item) {
        if (invoiceItems.contains(item) && state == -1) {
            invoiceItems.remove(item);
            return true;
        } else {
            return false;
        }
    }

    public void nextStage() {
        state += 1;
    }

    public int getTotalPrice() {
        int k = 0;
        for (int i = 0; i < invoiceItems.size(); i++) {
            Item pitem = invoiceItems.get(i);
            k += (pitem.getFood().getPrice() * pitem.getCount());
        }
        float fk = (float) k * TAX_RATE;
        this.taxfee = (int) Math.ceil(fk);
        this.totalprice = (int) (k + Math.ceil(fk));
        return this.totalprice;
    }

    public int getTaxFee() {
        getTotalPrice();
        return taxfee;
    }

    public ArrayList<Item> getInvoiceItems() {
        return invoiceItems;
    }
    public void displayInvoiceItems(){
        System.out.println("-------------------------");
        System.out.println("Customer " + this.customer.getCustomerNumber() + "'s invoice items:");
        for (int j = 0; j < this.getInvoiceItems().size(); j++) {
            System.out.println("Item " + (j + 1) + ": " + this.getInvoiceItems().get(j).getFood().getName() + " x" + this.getInvoiceItems().get(j).getCount() + "     Price: " + this.getInvoiceItems().get(j).getFood().getPrice()*this.getInvoiceItems().get(j).getCount());
        }
        System.out.println("-------------------------");
    }
}
