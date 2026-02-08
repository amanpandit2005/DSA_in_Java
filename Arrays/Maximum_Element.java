package L9_L10_L11_Arrays;

import java.util.Scanner;

public class Maximum_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array's Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Elements: ");

        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int max = arr[0];

        for (int i = 0; i < size; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.print(max);

    }
}
