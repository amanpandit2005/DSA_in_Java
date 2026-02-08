package L20_L21_Strings;

public class Most_Frequent_Character_3 {
    public char getMaxOccuringChar(String s) {
        int n = s.length();
        int[] freq = new int[26]; //Frequency Array (Subme 0 hai)
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int index = ch-97;
            freq[index]++;
//          freq[s.carAt(i)-97]++;
        }
        int maxFreq = -1;
        char ans = s.charAt(0);
        for(int i=0;i<26;i++){
            if(freq[i]>maxFreq){
                maxFreq=freq[i];
                ans=(char)(i+97);
            }
        }
        return ans;
    }
}
