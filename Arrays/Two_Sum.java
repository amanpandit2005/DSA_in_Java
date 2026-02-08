package L9_L10_L11_Arrays;

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
        boolean found=false;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==target)
                    found=true;
            }
        }
        if (found)
            System.out.println("Target Hits");
        else
            System.out.println("Target Miss");

    }
}
