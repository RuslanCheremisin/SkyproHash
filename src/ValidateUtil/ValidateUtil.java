package ValidateUtil;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtil {
    public static String validateString(String value) {
        if (value!=null && !value.isEmpty() && !value.isBlank()) {
            return value;
        }else{
//            throw new NoDriverLicenseException("Incorrect entry");
            return "No data";


        }
    }
    public static int validateInt(int value) {
        if (value > 0) {
            return value;
        } else {
            return 0;
        }
    }
    public static double validateDouble(double value) {
        if (value > 0) {
            return value;
        } else {
            return 0;
        }
    }
    public static char validateDriverLicense(char value) {
        if (value=='A' || value=='B'|| value=='C'|| value=='D') {
            return value;
        }else{
            return 'X';
        }
    }
    public static String validateDateDDMMYYYY(String birthDate){
        Pattern p = Pattern.compile("\\d{2}+\\.{1}+\\d{2}+\\.{1}+\\d{4}");
        Matcher m = p.matcher(birthDate);
        if (m.matches() &&
                Integer.parseInt(birthDate.substring(0,2))<32 &&
                Integer.parseInt(birthDate.substring(0,2))>0 &&
                Integer.parseInt(birthDate.substring(3,5))<13 &&
                Integer.parseInt(birthDate.substring(3,5))>0 &&
                Integer.parseInt(birthDate.substring(6))<= LocalDate.now().getYear() &&
                Integer.parseInt(birthDate.substring(6))>=LocalDate.now().getYear()-120){

                return birthDate;

        }else {
            throw new IllegalArgumentException("Wrong date format! Please use DD.MM.YYYY format(dots, not commas)");
//            return "Wrong date format! Please use DD.MM.YYYY format(dots, not commas)";
        }
    }
}
