package L9_L10_L11_Arrays;

import java.util.Scanner;

public class Search_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array's Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Elements: ");

        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter Element to Search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.println("Found at Index: " + i);
                found = true;
            }
        }
        if (!found)
            System.out.println("Not Found");
    }
}
