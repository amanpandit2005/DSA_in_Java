package L22_L23_L24_L25_Recursion;

import java.util.Scanner;

public class Reverse_of_Number {
    public static int reverse(int n, int r) {
        if(n==0){
            System.out.println(r);
            return r;
        }
        return reverse(n/10, r*10+n%10);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse: ");
        int n = sc.nextInt();
//        int r = 0;
//        while(n!=0){
//            r *=10;
//            r +=(n%10);
//            n/=10;
//        }
        System.out.println(reverse(n,0));
    }
}
