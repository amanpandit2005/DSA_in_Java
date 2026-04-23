package L20_L21_Strings;

public class Interning_and_New_Keyword {
    public static boolean equals(String s5, String s6) {
        if (s5.length() != s6.length()) {
            return false;
        }
        for(int i=0;i<s5.length();i++){
            if(s5.charAt(i)!=s6.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "Aman Pandit";
        String s2 = "Aman Pandit";
        System.out.println(s1==s2);

        String s3 = "Aman Pandit";
        String s4 = "Aman Pandit";
        System.out.println(s3.charAt(0) == s4.charAt(0));

        String s5 = "Aman Pandit";
        String s6 = new String("Aman Pandit");
        System.out.println(s5 == s6); //False because address is not same.

        System.out.println(s5.equals(s6));
        System.out.println(equals(s5,s6));
    }
}
