package L9_L10_L11_Arrays;

import java.util.Scanner;

public class Print_Negative_Only {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array's Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Elements: ");

        for (int i = 0; i <size; i++)
            arr[i] = sc.nextInt();

        for (int i=0;i<size;i++)
            if (arr[i]<0)
                System.out.print(arr[i]+" ");
    }
}
