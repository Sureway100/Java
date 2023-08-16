import java.lang.*;

import java.util.*;

class Resume {
    public static void main(String[] args) {
        // lets get the base input
        float base, height;

        System.out.println("what is your base?");

        Scanner userInfo = new Scanner(System.in);
        base = userInfo.nextFloat();

        // lets get the height input

        System.out.println("what is your height");

        // Scanner heightInput = new Scanner(System.in);
        height = userInfo.nextFloat();

        System.out.println("your base = " + base + " and your height = " + height);

        float result = (base * height) / 2;

        System.out.println("your area of triangle is " + result);

        userInfo.close();

    }
}