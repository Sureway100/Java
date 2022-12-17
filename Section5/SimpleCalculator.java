public class SimpleCalculator {
    private  double firstNumber;
    private double secondNumber;

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        return (secondNumber==0) ? 0 : firstNumber/secondNumber;
    }


    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

}



//
//HOW TO TEST
//
//public class HelloWorld {
//    public static void main(String[] args) {
//        SimpleCalculator simpleCalculator = new SimpleCalculator();
//        simpleCalculator.setFirstNumber(200.00);
//        simpleCalculator.setSecondNumber(10.00);
//        double speak = simpleCalculator.getMultiplicationResult();
//        System.out.println(speak);
//
//    }
//
//}






