package L8_Methods;

import java.util.Scanner;

public class Permutation_Combination_Function {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        System.out.println("nCr: "+fact(n)/(fact(r)*fact(n-r)));
        System.out.println("nPr: "+fact(n)/fact(n-r));
    }
}
