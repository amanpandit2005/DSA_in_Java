package L22_L23_L24_L25_Recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pre_in_Post {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        pip(n);
    }

    public static void pip(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+" "); // Pre
        pip(n-1);
        System.out.print(n+" "); // In
        pip(n-1);
        System.out.print(n+" "); // Post
    }
}
