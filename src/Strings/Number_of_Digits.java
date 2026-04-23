package L20_L21_Strings;

import java.util.Scanner;

public class Number_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "" + n;
        System.out.println(s.length());
        Scanner sc1 = new Scanner(System.in);
        double n1 = sc1.nextDouble();
        String s1 = "" + n1;
        System.out.println(s1.length());
    }
}
