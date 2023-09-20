import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;

/*
    This is Y11 CS Lab 2.1 which is learning how to use methods.
    Author: Alexis C.
    Date: 09-14-2023
 */

public class Main {

    public static void main(String[] args) {
        // Declaring variables
        int num1;
        int num2;
        int num3;
        int num4;
        int result;
        int addTwoResult;
        int halfNumber;
        double positiveDecimalToRound;
        double negativeDecimalToRound;
        String name;
        String tripleString;
        Scanner scanner = new Scanner(System.in);

        //prompts user for numbers to add
        System.out.println("Enter a number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        num2 = scanner.nextInt();
        result = add(num1,num2);
        System.out.println(num1 + "+" + num2 + "=" + result );
        System.out.println("Enter a third number: ");
        num3 = scanner.nextInt();
        System.out.println("Enter a fourth number: ");
        num4 = scanner.nextInt();
        scanner.nextLine();
        addTwoResult = add(num1, num2, num3, num4);
        System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + " = "  + addTwoResult);
        //Prompts for name
        System.out.println("\nEnter your name: ");
        name = scanner.nextLine();
        System.out.println(morningGreeting(name));
        System.out.println(afternoonGreeting(name));
        //Prompts for String to triple
        System.out.println("\nEnter a word: ");
        tripleString = scanner.nextLine();
        System.out.println(triple(tripleString));
        //Prompts for a number to half
        System.out.println("\nEnter a number you would like to half: ");
        halfNumber = scanner.nextInt();
        System.out.println("Half of your number is: " + half(halfNumber));
        //Prompts for a positive to round
        System.out.println("\nEnter a decimal you would like to round to the nearest integer: ");
        positiveDecimalToRound = scanner.nextDouble();
        System.out.println("Your positive decimal rounds to: " + roundPositiveValueToNearestInteger(positiveDecimalToRound));
        //Prompts for a negative decimal number to round
        System.out.println("\nEnter a negative decimal you would like to round to the nearest integer: ");
        negativeDecimalToRound = scanner.nextDouble();
        //checks if the user input value is negative or positive. If it is positive, the system will prompt until the user enters a negative decimal.
        while (negativeDecimalToRound > 0){
            System.out.println("\nThat is not a negative decimal. Enter a negative decimal you would like to round to the nearest integer: ");
            negativeDecimalToRound = scanner.nextDouble();
            if (negativeDecimalToRound < 0){
                System.out.println("Your negative decimal rounds to: " + roundNegativeValueToNearestInteger(negativeDecimalToRound));
            }
        }
        System.out.println("Your negative decimal rounds to: " + roundNegativeValueToNearestInteger(negativeDecimalToRound));

    }

    // 1. adding two numbers method
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    
    // 2. adding four numbers method
    public static int add(int num1, int num2, int num3, int num4){
        return add(add(num1, num2), add (num3, num4));
    }

    // 3. morningGreeting method
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting method
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }

    // 5. triple method
    public static String triple(String tripleString){
        return tripleString + tripleString + tripleString;
    }

    // 6. half method
    public static double half(int originalNumber){
        return originalNumber / 2d;
    }

    // 7. roundPositiveValueToNearestInteger method
    public static int roundPositiveValueToNearestInteger(double originalDecimal){
        return (int) Math.round(originalDecimal);
    }

    // 8. roundNegativeValueToNearestInteger method
    public static int roundNegativeValueToNearestInteger(double originalNegativeDecimal){
        BigDecimal bigDecimal = BigDecimal.valueOf(originalNegativeDecimal);
        bigDecimal = bigDecimal.setScale(0, RoundingMode.HALF_UP);
        return bigDecimal.intValue();
    }

}
