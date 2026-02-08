package L8_Methods;

import java.util.Scanner;

public class Swap_2_Numbers {
    public static void swap(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping: "+a +" , "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        swap(a,b);
    }
}
