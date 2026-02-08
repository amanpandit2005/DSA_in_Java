package L9_L10_L11_Arrays;

import java.util.Scanner;

public class Missing_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array's Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Elements: ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int ele : arr) {
            arraySum += ele;
        }
        System.out.println(sum-arraySum);
    }
}