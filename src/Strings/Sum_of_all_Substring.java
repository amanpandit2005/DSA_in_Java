package L20_L21_Strings;

public class Sum_of_all_Substring {
    public static void main(String[] args) {
        int sum = 0;
        String s = "Aman Pandit";
        for (int i=0;i<s.length();i++) {
            for (int j=i+1;j<=s.length();j++) {
                System.out.println(s.substring(i,j));
                sum++;
            }
        }
        System.out.print("Sum of Substring : ");
        System.out.println(sum);
    }
}
