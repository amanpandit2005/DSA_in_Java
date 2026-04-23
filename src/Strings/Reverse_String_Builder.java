package L20_L21_Strings;

import java.sql.SQLOutput;

public class Reverse_String_Builder {
    public static void main(String[] args) {
        String s = "Aman Pandit";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(s);
        System.out.println(sb);

        int i=0, j=sb.length()-1;
        while(i<=j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;

        }
        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.delete(4,11);
        System.out.println(sb);

        String s1 = "Aman";
        StringBuilder sb1 = new StringBuilder(s1);
        sb1.reverse();
        s1 = sb1.toString();
        System.out.println(s1);
    }
}
