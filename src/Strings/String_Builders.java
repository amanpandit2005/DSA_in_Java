package L20_L21_Strings;

import java.util.Scanner;

public class String_Builders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s =new StringBuilder();
        System.out.println(s.length()+" "+s.capacity());
        s.append("Aman Pandit");;
        System.out.println(s);
        System.out.println(s.length()+" "+s.capacity());

        System.out.println();

        StringBuilder sb =new StringBuilder(10);
        System.out.println(sb.length()+" "+sb.capacity());
        sb.append("Aman Pandit");;
        System.out.println(sb);
        System.out.println(sb.length()+" "+sb.capacity());

        StringBuilder SB = new StringBuilder(sc.nextLine()); // Taking input of StringBuilder
        System.out.println(SB);
    }
}
