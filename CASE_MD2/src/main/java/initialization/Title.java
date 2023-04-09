package initialization;

public class Title {
    private long id;
    private String items;//mặt hàng
    private String name;
    private double price;
    private double total;

    public Title() {
    }

    public Title(long id, String items, String name, double price,double total) {
        this.id = id;
        this.items = items;
        this.name = name;
        this.price = price;
        this.total = total;
    }

    public Title(String record){
        String[] fiels = record.split(",");
        this.id = Long.parseLong(fiels[0]);
        this.items = fiels[1];
        this.name = fiels[2];
        this.price = Double.parseDouble(fiels[3]);
        this.total = Double.parseDouble(fiels[4]);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return id + "," + items + "," + name + "," + price + "," + total;
    }
}
