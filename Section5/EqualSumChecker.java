public class EqualSumChecker {
    public static void main(String[] args) {
        //System.out.println(hasEqualSum (1, 1, 1));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasEqualSum (int firstNumber, int secondNumber, int thirdNumber) {
        return  (firstNumber * secondNumber ==  thirdNumber) ? true : false;
    }

    public static boolean hasTeen  (int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber >= 13 && firstNumber <= 19) || (secondNumber >= 13 && secondNumber <= 19) || (thirdNumber >= 13 && thirdNumber <= 19);
    }

//    public static boolean isTean(int num) {
//        return (num >= 13 || num <= 19);
//
//    }
}
