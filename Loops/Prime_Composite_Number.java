package L4_L5_Loops;

import java.util.Scanner;

public class Prime_Composite_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i=2;i<n;i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
            if (n==1)
                System.out.println("Neither Prime nor Composite");
            else if (flag==false)
                System.out.println("Composite Number");
            else
                System.out.println("Prime Number");



        }
    }

