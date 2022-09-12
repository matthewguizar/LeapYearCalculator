import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));
        System.out.println(checkLeapYear(2024));
        
    }

    public static boolean checkLeapYear(int year){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        return c.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    public static boolean isLeapYear(int year){
        if (year <= 0 || year > 9999){
            return false;
        } else if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0){
            return false;
        } else {
            return true;
        }
    }

}