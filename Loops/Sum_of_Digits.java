package L4_L5_Loops;

import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int sum = 0;
        int x;
        if (n<0)
            n=-n;
        while (n!=0) {
            x=n%10;
            sum+=x;
            n=n/10;
        }
        System.out.println(sum);
    }
}
