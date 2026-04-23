package L20_L21_Strings;

public class Palindrome_String {
    boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
