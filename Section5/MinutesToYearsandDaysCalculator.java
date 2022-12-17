public class MinutesToYearsandDaysCalculator {
    public static void main(String[] args) {
        //System.out.println(printYearsAndDays();
    }

    public static void printYearsAndDays(long minutes) {
        long years =  minutes / 525600;
        long days = (minutes % 525600) / 1440;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
