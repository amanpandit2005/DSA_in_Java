package L4_L5_Loops;

import java.util.Scanner;

public class Do_While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.print(i+" ");
            i++;
        }
        while(i<=n);
    }
}
