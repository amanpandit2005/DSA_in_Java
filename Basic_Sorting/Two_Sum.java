package L16_Basic_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array's Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Elements: ");

        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter Target: ");
        int target = sc.nextInt();
        int i = 0, j = size - 1;
        Arrays.sort(arr);
        boolean found = false;
        while (i < j) {
            if (arr[i] + arr[j] == target){
                found = true;
                break;
            }
            else if (arr[i] + arr[j] > target)
                j--;
            else if (arr[i] + arr[j] < target)
                i++;
        }
        if (found)
            System.out.println("\nTarget Hits");
        else
            System.out.println("\nTarget Miss");
    }
}
