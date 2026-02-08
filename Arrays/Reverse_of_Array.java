package L9_L10_L11_Arrays;

import java.util.Scanner;

public class Reverse_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array's Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Elements: ");

        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int i=0, j=size-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr)
            System.out.print(ele+" ");

    }
}