package Homework2;

public class Е4 {
    public static void main(String[] args) {
        int [] numbers = {1, 3, 5, 7, 11, 59, 134, 4, 50, 3};
        System.out.println("For loop: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        System.out.println("While loop: ");
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }
}
