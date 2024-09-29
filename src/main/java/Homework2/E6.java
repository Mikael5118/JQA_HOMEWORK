package Homework2;

import java.util.Arrays;

public class E6 {
    public static void main(String[] args) {
        int firstArr [] = {1, 2, 3};
        int secondArr [] = {1, 2, 3};
        boolean areEqual = Arrays.equals(firstArr, secondArr);
        if (areEqual) {
            System.out.println("The arrays are equal");
        } else {
            System.out.println("The arrays are not equal");
        }
    }
}
