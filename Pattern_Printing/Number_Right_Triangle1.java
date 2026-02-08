package L6_L7_Pattern_Printing;

import java.util.Scanner;

public class Number_Right_Triangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows and Columns: ");
        int order = sc.nextInt();

        for (int i = 1; i<= order; i++){
            for (int j=1;j<=i;j++)
                System.out.print(j+"  ");
            System.out.println();

        }
    }
}
