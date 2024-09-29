package Homework1;

import java.util.Scanner;

public class SecondExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        int c = scanner.nextInt();
        double d = scanner.nextDouble();

        // Assign a to c and b to d
        a=c;
        b=d;
        System.out.println(a);
        System.out.println(b);

        //cast
        double a1 = (double) a;
        double c1 = (double) c;
        System.out.println("Before conversion: " + a);
        System.out.println("After conversion: " + a1);
        System.out.println("Before conversion: " + c);
        System.out.println("After conversion: " + c1);
    }
}
