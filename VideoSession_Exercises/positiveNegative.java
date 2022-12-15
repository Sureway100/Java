package VideoSession_Exercises;
public class positiveNegative {
    public static void main(String[] args) {
        checkNumber(2);
        checkNumber(0);
        checkNumber(-4);
    }
    public static void checkNumber (int number){
        if (number > 0){
            System.out.println("postive");
        } else if (number < 0) {
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
}
