package L1_L2_Basics;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle Amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time in Year: ");
        double t = sc.nextDouble();

        double si = p*r*t/100;
        System.out.print("Simple Interest: ");
        System.out.println(si);
    }
}
