package Homework1;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number1: ");
        int number1 = scanner.nextInt();

        System.out.println("Please enter number2: ");
        double number2 = scanner.nextDouble();

        System.out.println("You entered: " + number1);
        System.out.println("You entered: " + number2);
        System.out.println("Please enter number 3: ");
        int number3 = scanner.nextInt();

        double min = Math.min(number1, number2);
        double max = Math.max(number1, number2);
        boolean isBetween = (number3 > min && number3 < max);

        if (isBetween) {
            System.out.println("Number 3 is between first and second number.");
        } else {
            System.out.println("Number 3 is not between first and second number.");
        }

    }
}
