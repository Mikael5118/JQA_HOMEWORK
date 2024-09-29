package Homework1;

import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 5;
        double b = 2.5;
        int c = 7;
        double d = 101.11;

        // converting "a" and "c" to double
        double a1 = (double) a;
        double c1 = (double) c;
        System.out.println("Before conversion: " + a);
        System.out.println("After conversion " + a1);
        System.out.println("Before conversion: " + c);
        System.out.println("After conversion: " + c1);

        // converting "b" and "d" to int
        int b1 = (int) b;
        int d1 = (int) d;
        System.out.println("Before conversion: " + b);
        System.out.println("After conversion: " + b1);
        System.out.println("Before conversion: " + d);
        System.out.println("After conversion: " + d1);

    }
}
