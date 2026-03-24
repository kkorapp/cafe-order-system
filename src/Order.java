import java.util.ArrayList;

public class Order {

    private int orderNumber;
    private CafeCustomer customer;
    private ArrayList<MenuItem> items;
    private boolean paid;
    private static int nextOrderNumber = 1;

    public Order(CafeCustomer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.paid = false;
        this.orderNumber = nextOrderNumber++;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public int countItems() {
        return items.size();
    }

    public void markAsPaid() {
        paid = true;
    }

    public static int getNextOrderNumber() {
        return nextOrderNumber;
    }

    @Override
    public String toString() {
        return "Order #" + orderNumber +
                ", Customer: " + customer.getFullName() +
                ", Items count: " + items.size() +
                ", Total: " + calculateTotal() +
                ", Paid: " + paid;
    }
}