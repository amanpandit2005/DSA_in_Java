package L6_L7_Pattern_Printing;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows and Columns: ");
        int order = sc.nextInt();
        int nsp=order-1;
        int nst=1;
        for (int i = 1; i<= order; i++){
            for (int j=1;j<=nsp;j++){
                System.out.print("   ");
            }
            for (int k = 1; k <=nst; k++) {
                System.out.print("*  ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
        nsp=1;
        nst=2*order-3;
        for (int i = 1; i <=order; i++) {
            for (int j = 1; j <= nsp; j++)
                System.out.print("   ");

            for (int k = 1; k <= nst; k++) {
                System.out.print("*  ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}
