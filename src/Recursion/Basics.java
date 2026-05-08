package Recursion;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Aman(n);
        print(n);
    }
    public static void Aman(int n){
        if(n==0){
            return;
        }
        System.out.println("Aman Pandit");
        Aman(n-1);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
