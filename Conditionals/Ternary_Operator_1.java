package L3_Conditionals;

import java.util.Scanner;

public class Ternary_Operator_1 {
    public static void main(String[] args) {

//  Even Odd using Ternary Operator

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println((n%2==0) ? "Even" : "Odd" );


    }
}
