package L8_Methods;

import java.util.Scanner;

public class Max_of_3_using_Builtin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();

        int x = Math.max(a,b);
        int y = Math.max(x,c);

        System.out.println("\nMaximum of three: "+y);


        // Another Approach


        System.out.println("\nMaximum of three: "+Math.max(Math.max(a,b),c));
    }
}
