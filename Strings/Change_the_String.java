package L20_L21_Strings;

public class Change_the_String {
    String modify(String s) {
        if(s.length()==0){
            return "-1";
        }
        int n=(int)s.charAt(0);
        if(n>=65&&n<=90){
            return s.toUpperCase();
        }else{
            return s.toLowerCase();
        }
    }
}
