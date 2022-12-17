public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 100 == 0 && year % 400 == 0){
                return year % 4 == 0 ? true : false;
            } else if (year % 100 != 0) {
                return year % 4 == 0 ? true : false;
            }
        }
        return false;
    }
}
