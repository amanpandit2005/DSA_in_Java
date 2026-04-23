package L3_Conditionals;

import java.util.Scanner;

public class Check_for_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        double n =sc.nextDouble();
        int x = (int)n;
        if(n-x==0)
            System.out.println("Integer");
        else
            System.out.println("Not Integer");


    }
}
