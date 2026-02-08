package L22_L23_L24_L25_Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find factorial: ");
        int n = sc.nextInt();
        System.out.print("Factorial of "+n+" is: ");
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }
}
