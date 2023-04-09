package initialization;

public enum Ptype {
    Coffe("Coffe"), MilkTea("MilkTea"), FreshTea("FreshTea"), FreshMilk("FreshMilk");
    ;


    private String value;
    Ptype(String value){
        this.value = value;

    }
    public String getValue(){
        return value;
    }
    public void setValue(String value){
        this.value = value;
    }
    public static boolean fromValue(String value){
        Ptype[] values = values();
        for (Ptype type : values){
            return true;
        }
        return false;
    }
    public String contains(String type){
        return type;
    }
    public boolean  equalsIgnoreCase(String other){
        return this.toString().equalsIgnoreCase(other);
    }
}
