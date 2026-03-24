public class Main {
    public static void main(String[] args) {

        MenuItem m1 = new MenuItem("C-01", "Espresso", 9.0, "coffee");
        MenuItem m2 = new MenuItem("C-02", "Cappuccino", 13.5, "coffee");
        MenuItem m3 = new MenuItem("D-01", "Cheesecake", 16.0, "dessert");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("Product count: " + MenuItem.getProductCount());

        MenuItem espressoCopy = new MenuItem("C-01", "Espresso duplicate", 9.0, "coffee");
        System.out.println("Are equal: " + m1.equals(espressoCopy));

        CafeCustomer c1 = new CafeCustomer(1, "Ali", "Yilmaz", "ali@mail.com");
        CafeCustomer c2 = new CafeCustomer(1, "Ali", "Yilmaz", "ali@mail.com");

        System.out.println(c1);
        System.out.println("Customers equal: " + c1.equals(c2));

        Order order = new Order(c1);

        order.addItem(m1);
        order.addItem(m2);
        order.addItem(m3);

        System.out.println(order);

        System.out.println("Total value: " + order.calculateTotal());
        System.out.println("Number of items: " + order.countItems());
        System.out.println("Number of products created in the system: " + MenuItem.getProductCount());

        order.markAsPaid();

        System.out.println(order);
    }
}