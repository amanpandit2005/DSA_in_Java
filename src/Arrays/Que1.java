package L9_L10_L11_Arrays;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array's Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Elements: ");

        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();


        for (int i = 0; i < size; i++){
            if(i%2==0)
                System.out.print(arr[i]+10+" ");
            else
                System.out.print(arr[i]*2+" ");
        }
    }
}
