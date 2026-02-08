package L20_L21_Strings;

import java.util.Scanner;

public class Integer_to_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "  ";
        s+=n;
        System.out.println(s);
        String s1 = Integer.toString(n);
        System.out.println(s1);
    }
}
