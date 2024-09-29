package Homework1;

import java.util.Scanner;

public class FourthExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workingHours = scanner.nextInt();
        double money = scanner.nextDouble();
        boolean workingDay = scanner.nextBoolean();

        if (workingDay == true)
            System.out.println("I will go to work, because it's working day");
        else {
            if (money > 10)
                System.out.println("I will go to the cinema");
            else if (money < 10 && money > 5)
                System.out.println("I will go to buy icecream");
            else
                System.out.println("I will stay at home and watch TV");
        }
    }
}
