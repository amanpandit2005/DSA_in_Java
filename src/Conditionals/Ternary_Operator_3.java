package L3_Conditionals;

import java.util.Scanner;

public class Ternary_Operator_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();

        if (a==b && b==c)
            System.out.println("All three Numbers are Equal");
        else
            System.out.println((a>b) ? (a>c) ? "1st Number is greatest" : "3rd number is Greatest" : (b>c) ? "2nd Number is Greatest" : "3rd Number is Greatest");


        }
}