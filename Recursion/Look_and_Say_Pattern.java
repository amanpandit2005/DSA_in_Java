package L22_L23_L24_L25_Recursion;

public class Look_and_Say_Pattern {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s = countAndSay(n-1); // s ko padhna h
        String ans = "";
        int i=0, j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            else{
                int freq=j-i;
                ans+=freq;
                ans+=s.charAt(i);
                i=j;
            }
        }
        int freq=j-i;
        ans+=freq;
        ans+=s.charAt(i);
        return ans;

    }
}
