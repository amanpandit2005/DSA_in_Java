package L22_L23_L24_L25_Recursion;

import java.util.Scanner;

public class Recursion_on_Arrays {
    public static void main(String[] args) {
        int[] arr = {1,12,23,34,43,54,56,55,67,78,89,98,100};
        recPrint1(arr,0);
        System.out.println();
        recPrint2(arr,0);
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter Number to Search: ");
        int target = sc.nextInt();
        System.out.println("Found: "+exists(arr, target,0));
    }
    public static void recPrint1(int[] arr, int index){
        int n = arr.length;
        if(index==n){
            return;
        }
        System.out.println(arr[index]);
        recPrint1(arr,index+1);
    }
    public static void recPrint2(int[] arr, int index){
        int n = arr.length;
        if(index==n){
            return;
        }
        recPrint2(arr,index+1);
        System.out.println(arr[index]);
    }
    public static boolean exists(int[] arr, int target, int index){
        if(index== arr.length){
            return false;
        }
        if(arr[index]== target){
            return true;
        }
        return exists(arr,target,index+1);
    }
}
