public class HelloWorld {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(200.00);
        simpleCalculator.setSecondNumber(10.00);
        double speak = simpleCalculator.getMultiplicationResult();
        System.out.println(speak);

    }

}
