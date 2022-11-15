public class App {

        // Main file try the test cases here
        // Contains the sample test case with a few added features
        public static void main(String[] args) {

                Address address = new Address(51.4934, 0, "Greenwich");
                Address address2 = new Address(35.7219, 51.3347, "Tehran");
                System.out.println(address.distance_from(address2));
                Customer firstCustomer = new Customer("some guy", address);
                // add Foods
                Food f1 = new Food("pizza", 80000);
                Food f2 = new Food("coca cola", 6000);
                Food f3 = new Food("Cinnamon Roll", 18000);
                Food f4 = new Food("tea", 10000);
                Food f5 = new Food("pasta", 55000);
                // first invoice object for customer no.1
                Invoice firstInvoice = new Invoice(firstCustomer);

                Item i1 = new Item(f1, 1, "with extra pepper");
                Item i2 = new Item(f5, 1, "More cheese");
                // we can also define a function with 2 args for this situations
                Item i3 = new Item(f2, 3);
                Item i4 = new Item(f3, 4);
                Item i5 = new Item(f4, 5);
                /// the sample add items
                firstInvoice.addItem(i1);
                firstInvoice.addItem(i2);
                firstInvoice.addItem(i3);
                firstInvoice.addItem(i4);
                firstInvoice.addItem(i5);
                // added feature to display menu if you want to use it
                Food.displayMenu();
                System.out.printf("customer number: %s%n", firstCustomer.getCustomerNumber());
                // added feature to display invoice items if you want to use it (optional not
                // required)
                firstInvoice.displayInvoiceItems();
                System.out.printf("invoice submit time: %s%n", firstInvoice.getSubmitTime().toString());
                // another additional method to get tax fee for each customer's invoice again
                // optional -----> getTaxFee()
                System.out.printf("invoice tax fee: %s%n", firstInvoice.getTaxFee());
                System.out.printf("invoice total price: %s%n", firstInvoice.getTotalPrice());
                // show the distance between two given adresses
                System.out.println(address.distance_from(address2) + "km from " + address.written_address + " to "
                                + address.written_address);

        }
}
