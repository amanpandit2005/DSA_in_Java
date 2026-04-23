package L4_L5_Loops;

import java.util.Scanner;

public class Factorial_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i=1;i<=n;i++)
            fact *= i;
        System.out.println("Factorial: "+fact);
    }
}

