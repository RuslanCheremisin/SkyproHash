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
    public static char validateChar(char value) {
        if (value=='A' || value=='B'|| value=='C'|| value=='D') {
            return value;
        }else{
            return 'X';
        }
    }
}
