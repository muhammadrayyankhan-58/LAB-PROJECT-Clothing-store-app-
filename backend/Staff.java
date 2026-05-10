
public class Staff extends User {

    public Staff(String username, String password) {
        super(username, password, Role.STAFF);
    }

    // Polymorphism: Staff version
    @Override
    public String getDashboardAccess() {
        return "Orders, Inventory";
    }

    public boolean canViewOrders()      { return true; }
    public boolean canManageInventory() { return true; }
    public boolean canManageStaff()     { return false; }
}
