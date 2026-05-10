
public class Order {

    private int    id;
    private String customerName;
    private String orderDate;
    private double totalPrice;
    private String status;

    public Order(int id, String customerName, String orderDate,
                 double totalPrice, String status) {
        this.id           = id;
        this.customerName = customerName;
        this.orderDate    = orderDate;
        this.totalPrice   = totalPrice;
        this.status       = status;
    }

    // Getters
    public int    getId()            { return id; }
    public String getCustomerName()  { return customerName; }
    public String getOrderDate()     { return orderDate; }
    public double getTotalPrice()    { return totalPrice; }
    public String getStatus()        { return status; }

    // Setter
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Order[#AE-" + id + " | " + customerName + " | $" + totalPrice + " | " + status + "]";
    }
}
