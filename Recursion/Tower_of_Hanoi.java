package L22_L23_L24_L25_Recursion;

import java.util.Scanner;

public class Tower_of_Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Disks: ");
        int n = sc.nextInt();
        hanoi(n,'A','B','C');
    }

    public static void hanoi(int n, char src, char helper, char dstn) {
        if(n==0){
            return;
        }
        hanoi(n-1, src, dstn, helper); // n-1 disks from A to B via C
        System.out.println(src +" -> "+ dstn); // Largest from A to C
        hanoi(n-1, helper, src, dstn); // n-1 disks from B to C via A
    }
}