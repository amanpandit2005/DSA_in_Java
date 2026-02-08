package L9_L10_L11_Arrays;

import java.util.Scanner;

public class Product_of_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array's Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Elements: ");

        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int product = 1;

        for (int i = 0; i < size; i++)
            product *= arr[i];
        System.out.print(product);

    }
}
