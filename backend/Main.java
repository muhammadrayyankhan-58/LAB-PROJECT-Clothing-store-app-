
public class Main {

    public static void main(String[] args) {

        System.out.println("=== 🦅 American Eagle — Week 1 Demo ===\n");

        // ── OOP: Inheritance + Polymorphism ──────────
        System.out.println("--- OOP: Inheritance & Polymorphism ---");

        User customer = new User("guest", "", User.Role.CUSTOMER);
        Staff staff   = new Staff("staff1", "staff123");
        Admin admin   = new Admin("admin", "admin123");

        // Polymorphism: same method, different output
        System.out.println(customer + " → " + customer.getDashboardAccess());
        System.out.println(staff    + " → " + staff.getDashboardAccess());
        System.out.println(admin    + " → " + admin.getDashboardAccess());

        System.out.println("\nCan staff manage staff? " + staff.canManageStaff());
        System.out.println("Can admin manage staff? " + admin.canManageStaff());

        // ── OOP: Encapsulation ────────────────────────
        System.out.println("\n--- OOP: Encapsulation ---");

        Product shirt = new Product(1, "Classic Denim Shirt", "Shirts",
                49.99, 48, false, true, "Timeless denim shirt", "👕");

        System.out.println(shirt);
        shirt.setPrice(44.99); // use setter
        System.out.println("After price update: $" + shirt.getPrice());

        // ── Models ────────────────────────────────────
        System.out.println("\n--- Models ---");

        Product jacket = new Product(2, "Puffer Jacket", "Jackets",
                89.99, 23, true, true, "Premium puffer", "🧥");

        CartItem item1 = new CartItem(shirt, 2);
        CartItem item2 = new CartItem(jacket, 1);
        System.out.println("Cart: " + item1 + " | " + item2);

        double total = item1.getSubtotal() + item2.getSubtotal();
        Order order = new Order(1001, "Muhammad Rayyan", "May 10, 2025", total, "Processing");
        System.out.println(order);

        System.out.println("\n Models working");
    }
}
