# Java
A folder for all my java projects



Assignment 1 =>
this is just a simple java script. A dog java class and a dogTest java class with the main method.
the main method class tries to access the attributes and method of the dog class

Assignment 2 => 
this is same as assignment one... as movie java class is created and movieTest class with the main method creates instance of the class and tries to access the attributes and the methods.

Assignment 3 =>
this is a guessing game between three players who randomly guess numbers between 1- 10 as set by the program
the game only end when one player guesses the correct value rightly.

Assignment 4 =>
this is a currency converter, this converts rupee to dollar or euros, depending on user selection.










public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
