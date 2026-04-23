package L6_L7_Pattern_Printing;

import java.util.Scanner;

public class Star_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows and Columns: ");
        int order = sc.nextInt();

        for (int i = 0; i< order; i++){
            for (int j = 0; j< order; j++)
                System.out.print("*  ");
            System.out.println();
        }
    }
}
