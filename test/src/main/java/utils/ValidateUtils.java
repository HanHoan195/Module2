package utils;

import java.util.regex.Pattern;

public class ValidateUtils {
    public static final String NAME_REGEX = "^([A-ZÀ-ỹ][a-zÀ-ỹ]*[ ]?)+$";
    public static final String ADDRESS_REGEX = "^([^. ][.]*[ ]?)+$";
    public static boolean isNameValid(String name){
        return Pattern.compile(NAME_REGEX).matcher(name).matches();
    }
    public static boolean isAddressValid(String number){
        return Pattern.compile(ADDRESS_REGEX).matcher(number).matches();
    }
}
