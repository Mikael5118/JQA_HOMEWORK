package Homework2;

import java.util.Arrays;

public class E5 {
    public static void main(String[] args) {
        int a[] = {10, 12, 1, 8, 4};
        int b[] = Arrays.copyOf(a, 5);

        System.out.println("Array a consist of: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Array b consist of: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
