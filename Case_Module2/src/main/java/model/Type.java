package model;

public enum Type    {
    IPHONE("IPHONE"), SAMSUNG("SAMSUNG"), XIAOMI("XIAOMI");
    private String value;
    Type(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static boolean fromValue(String value) {
        Type[] values = values();
        for (Type type : values) {
            if (type.value.equals(value))
                return true;
        }

        return false;
    }

    public String contains(String type) {
        return type;
    }
    public boolean equalsIgnoreCase(String other) {
        return this.toString().equalsIgnoreCase(other);
    }
}
