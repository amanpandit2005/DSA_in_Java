package L4_L5_Loops;

import java.util.Scanner;

public class Arithmatic_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of terms: ");
        int n = sc.nextInt();
        for(int i=2;i<=3*n-1;i=i+3)
            System.out.print(i+" ");
    }
}
