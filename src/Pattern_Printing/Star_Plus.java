package L6_L7_Pattern_Printing;

import java.util.Scanner;

public class Star_Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows and Columns (Odd): ");
        int order = sc.nextInt();

        for (int i = 1; i<= order; i++){
            for (int j=1;j<=order;j++) {
                if (i== (order+1)/2 || j==(order+1)/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
