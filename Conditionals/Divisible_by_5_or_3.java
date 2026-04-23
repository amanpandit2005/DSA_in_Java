package L3_Conditionals;

import java.util.Scanner;

public class Divisible_by_5_or_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if (n%5==0 || n%3==0)
            System.out.println("Divisible by 3 or 5");
        else
            System.out.println("Not Divisible by 3 or 5");


    }
}
