package L6_L7_Pattern_Printing;

import java.util.Scanner;

public class Star_Vertically_Flipped_Triangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows and Columns: ");
        int order = sc.nextInt();

        for (int i = 1; i<= order; i++){
            for (int j=1;j<=order;j++){
                if (i+j>order)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
