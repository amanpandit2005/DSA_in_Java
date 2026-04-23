package L4_L5_Loops;

import java.util.Scanner;

public class Print_n_Types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entern Number of terms: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.print(i+" ");
    }
}
