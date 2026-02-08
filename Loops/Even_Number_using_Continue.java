package L4_L5_Loops;

import java.util.Scanner;

public class Even_Number_using_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            if (i%2!=0)
                continue;
            System.out.print(i+" ");
        }
    }
}
