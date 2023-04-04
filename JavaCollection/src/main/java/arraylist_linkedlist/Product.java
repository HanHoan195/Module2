package arraylist_linkedlist;

public class Product {
    private int id;
    private String productName;
    private String prodcutInformation;

    private double price;
    public Product(int id, String productName, String prodcutInformation, double price) {
        this.id = id;
        this.productName = productName;
        this.prodcutInformation = prodcutInformation;
        this.price = price;
    }
    public Product(){

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProdcutInformation() {
        return prodcutInformation;
    }

    public void setProdcutInformation(String prodcutInformation) {
        this.prodcutInformation = prodcutInformation;
    }
}
