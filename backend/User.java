
public class User {

    public enum Role { CUSTOMER, STAFF, ADMIN }

    // Encapsulation: private fields
    private String username;
    private String password;
    private Role   role;

    // Constructor
    public User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role     = role;
    }

    // Getters
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public Role   getRole()     { return role; }

    // Polymorphism: overridden in Staff and Admin
    public String getDashboardAccess() {
        return "No dashboard access";
    }

    @Override
    public String toString() {
        return "User[" + username + " | " + role + "]";
    }
}
