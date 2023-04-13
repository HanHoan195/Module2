package Bai13.utils;

import java.util.regex.Pattern;

public class ValidateUtils {
    public static final String EMPLOYEE_NAME_REGEX = "^[A-Za-z][A-Za-z0-9_ ]{7,19}$";
    //public static final String BOOK_DESCRIPTION_REGEX = "^[A-Za-z][A-Za-z0-9_ ]{7,99}$";

    public static boolean isValidEmployeeName(String employeeName){
        return Pattern.matches(EMPLOYEE_NAME_REGEX, employeeName);
    }
}
