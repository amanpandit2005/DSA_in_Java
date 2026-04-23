package L4_L5_Loops;

import java.util.Scanner;

public class Digits_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(n==0)
            n=1;
        int digits=0;
        while(n!=0){
            n=n/10;
            digits++;
        }
        System.out.println(digits);
    }
}
