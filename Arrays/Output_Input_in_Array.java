package L9_L10_L11_Arrays;

import java.util.Scanner;

public class Output_Input_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,23,34,45,67,88,56,67,78,89,90};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);
        System.out.println(arr[8]);
        System.out.println(arr[9]);
        System.out.println(arr[10]);

        System.out.println("\n"+(arr.length));

        for (int i=0;i< (arr.length);i++)
            System.out.print(arr[i]+" ");

        System.out.println();

        System.out.print("Enter Elements: ");

          int[] x = new int[10];
          for(int i=0;i<(x.length);i++)
              x[i] = sc.nextInt();

        for (int i=0;i< (x.length);i++)
            System.out.print(x[i]*2+" ");

    }
}
