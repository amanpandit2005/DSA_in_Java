package L4_L5_Loops;

import java.util.Scanner;

public class Reverse_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int x;
        int rev=0;
        while(n!=0){
            x=n%10;
            rev*=10;
            rev=rev+x;
            n=n/10;
        }
        System.out.println("Reverse of Number: "+rev);
    }
}
