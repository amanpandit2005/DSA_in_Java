package L6_L7_Pattern_Printing;

import java.util.Scanner;

public class Star_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int col = sc.nextInt();

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++)
                System.out.print("*  ");
            System.out.println();
        }
    }
}
