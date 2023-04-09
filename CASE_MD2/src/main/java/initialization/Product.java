package initialization;

public class Product {
    private int id;
    private Ptype type;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, Ptype type, String name, double price) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
    }
    public Product(String raw){
        String[] strings = raw.split(";");
        this.id = Integer.parseInt(strings[0]);
        this.type = Ptype.valueOf(strings[1]);
        this.name = strings[2];
        this.price = Double.parseDouble(strings[3]);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ptype getType() {
        return type;
    }

    public void setType(Ptype type) {
        this.type = type;
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

    @Override
    public String toString() {
        return id + ";" + type + ";" + name + ";" + price;
    }
}
