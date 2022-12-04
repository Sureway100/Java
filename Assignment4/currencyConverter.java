package Assignment4;

import java. util.Scanner;

/**
 * CurrencyConverter
 */
public class currencyConverter {

    public static void main(String[] args) {
        System.out.println("1 Ruppe");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        // take input
        Scanner sc = new Scanner(System.in);
        System. out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        // convert the amount
        switch (choice) {
            case 1:
                currencyFucntions one = new currencyFucntions();
                one.Ruppe_to_other(amount);
             //one = new Ruppe_to_other(amount);
            break;
            case 2:
                currencyFucntions two = new currencyFucntions();
                two.Dollar_to_other(amount);
                //Dollar_to_other(amount);
                break;
            case 3:
                currencyFucntions three = new currencyFucntions();
                three.Euro_to_other(amount);
                //Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }


    

}
