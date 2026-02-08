package L6_L7_Pattern_Printing;

import java.util.Scanner;

public class Capital_Alphabets_Horizontally_Flipped_Triangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows and Columns: ");
        int order = sc.nextInt();

        for (int i = 1; i<= order; i++){
            for (int j=1;j<=order+1-i;j++)
                System.out.print((char)(i+64)+"  ");
            System.out.println();

        }
    }
}
