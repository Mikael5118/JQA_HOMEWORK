package Homework1;

import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();
        double originalNumber3 = number3;

        number1 = number2;
        number2 = number3;
        number3 = number1;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        double sum = (number1 + number2);
        System.out.println(sum);
        double difference = sum - originalNumber3;
        System.out.println(difference);
    }
}
