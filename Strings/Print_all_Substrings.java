package L20_L21_Strings;

public class Print_all_Substrings {
    public static void main(String[] args) {
        String s = "Aman Pandit";
        for (int i=0;i<s.length();i++) {
            for (int j=i+1;j<=s.length();j++) {
                System.out.println(s.substring(i,j));

            }
        }
    }
}
