package L6_L7_Pattern_Printing;

import java.util.Scanner;

public class Number_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows and Columns: ");
        int order = sc.nextInt();

        for (int i = 1; i<= 2*order-1; i++){
            for (int j = 1; j<= 2*order-1; j++){
                int a=i, b=j;
                if(i>order)
                    a=2*order-i;
                if(j>order)
                    b=2*order-j;
                System.out.print(Math.min(a,b)+"  ");
            }

            System.out.println();
        }
    }
}