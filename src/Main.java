public class Main {
    public static void main(String[] args) {

        MenuItem m1 = new MenuItem("C-01", "Espresso", 9.0, "coffee");
        MenuItem m2 = new MenuItem("C-02", "Cappuccino", 13.5, "coffee");

        System.out.println(m1);
        System.out.println(m2);

        System.out.println("Product count: " + MenuItem.getProductCount());

        MenuItem m3 = new MenuItem("C-01", "Duplicate Espresso", 9.0, "coffee");

        System.out.println("Are equal: " + m1.equals(m3));
        CafeCustomer c1 = new CafeCustomer(1, "Ali", "Yilmaz", "ali@mail.com");
        CafeCustomer c2 = new CafeCustomer(1, "Ali", "Yilmaz", "ali@mail.com");

        System.out.println(c1);
        System.out.println("Customers equal: " + c1.equals(c2));
        Order order = new Order(c1);

        order.addItem(m1);
        order.addItem(m2);

        System.out.println(order);

        System.out.println("Total value: " + order.calculateTotal());
        System.out.println("Number of items: " + order.countItems());

        order.markAsPaid();

        System.out.println(order);
    }
}

