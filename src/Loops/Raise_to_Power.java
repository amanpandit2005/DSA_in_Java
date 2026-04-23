package L4_L5_Loops;

import java.util.Scanner;

public class Raise_to_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.print("Enter Power: ");
        int p = sc.nextInt();
        int power=1;
        for (int i = 1; i <= p; i++)
            power *=n;
        System.out.println(n+" raised to the power "+p+" is "+power);
    }
}
