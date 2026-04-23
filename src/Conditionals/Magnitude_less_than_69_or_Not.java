package L3_Conditionals;

import java.util.Scanner;

public class Magnitude_less_than_69_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if (n<0)
            n = -n;
        if (n<69)
            System.out.println("Smaller than 69");
        else
            System.out.println("More than 69");


    }
}
