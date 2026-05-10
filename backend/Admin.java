
public class Admin extends Staff {

    public Admin(String username, String password) {
        super(username, password);
    }

    // Polymorphism: Admin version
    @Override
    public String getDashboardAccess() {
        return "Orders, Inventory, Staff Management, Analytics";
    }

    @Override
    public Role getRole() { return Role.ADMIN; }

    @Override
    public boolean canManageStaff()  { return true; }
    public boolean canDeleteProducts(){ return true; }
    public boolean canViewAnalytics() { return true; }
}
