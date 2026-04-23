package L16_Basic_Sorting;

import java.util.ArrayList;
import java.util.Arrays;


public class Common_Elements {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        Arrays.sort(a);
        Arrays.sort(b);
        while (i<a.length && j<b.length){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return ans;
    }
}
