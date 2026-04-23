package L4_L5_Loops;

import java.util.Scanner;

public class Sum_of_Number_and_its_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int x = n;
        int rev = 0;
        while(n!=0){
            rev*=10;
            rev+=(n%10);
            n=n/10;
        }
        System.out.println("\nGiven Number: "+x);
        System.out.println("Reverse of Number: "+rev);
        System.out.println("Sum of both: "+(x+rev));
    }
}
