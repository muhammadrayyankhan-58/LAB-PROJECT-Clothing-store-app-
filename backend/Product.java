
public class Product {

    private int     id;
    private String  name;
    private String  category;
    private double  price;
    private int     stockQuantity;
    private boolean isTrending;
    private boolean isHotSelling;
    private String  description;
    private String  emoji;

    public Product(int id, String name, String category, double price,
                   int stockQuantity, boolean isTrending, boolean isHotSelling,
                   String description, String emoji) {
        this.id            = id;
        this.name          = name;
        this.category      = category;
        this.price         = price;
        this.stockQuantity = stockQuantity;
        this.isTrending    = isTrending;
        this.isHotSelling  = isHotSelling;
        this.description   = description;
        this.emoji         = emoji;
    }

    // Getters
    public int     getId()            { return id; }
    public String  getName()          { return name; }
    public String  getCategory()      { return category; }
    public double  getPrice()         { return price; }
    public int     getStockQuantity() { return stockQuantity; }
    public boolean isTrending()       { return isTrending; }
    public boolean isHotSelling()     { return isHotSelling; }
    public String  getDescription()   { return description; }
    public String  getEmoji()         { return emoji; }

    // Setters
    public void setName(String name)          { this.name = name; }
    public void setPrice(double price)        { this.price = price; }
    public void setStockQuantity(int qty)     { this.stockQuantity = qty; }
    public void setTrending(boolean t)        { this.isTrending = t; }
    public void setHotSelling(boolean h)      { this.isHotSelling = h; }
    public void setDescription(String desc)   { this.description = desc; }

    @Override
    public String toString() {
        return "Product[" + id + " | " + name + " | $" + price + " | Stock:" + stockQuantity + "]";
    }
}
