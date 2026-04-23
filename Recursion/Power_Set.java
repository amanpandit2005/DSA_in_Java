package L22_L23_L24_L25_Recursion;

import java.util.*;

public class Power_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        List<String> list = new ArrayList<>();
        subsets("",s,0,list);
        System.out.println(list);
    }
    public static void subsets(String ans, String s, int idx, List<String> list) {
        if(idx==s.length()){
            list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch,s,idx+1, list); // Pick
        subsets(ans,s,idx+1, list); // Skip
    }
}
