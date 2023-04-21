package utils;

import static java.time.chrono.JapaneseEra.values;

public enum Gender {
    MALE("MALE"), FEMALE("FEMAL");
    private String value;
    Gender(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public static boolean fromValue(String value) {
        Gender[] values = values();
        for (Gender type : values) {
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
