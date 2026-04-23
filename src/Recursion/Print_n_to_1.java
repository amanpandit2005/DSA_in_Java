package L22_L23_L24_L25_Recursion;

import java.util.Scanner;

public class Print_n_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        printn1(n);
        System.out.println();
        print1n(n);
    }
    public static void printn1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printn1(n-1);
    }
    public static void print1n(int n){
        if(n==0){
            return;
        }
        print1n(n-1);
        System.out.print(n+" "); // Printing done during call back
    }
}
