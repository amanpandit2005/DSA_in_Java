package L27_Cyclic_Sort;

import java.util.ArrayList;

public class Find_Duplicates {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while(i<n){
            int rightIdx = arr[i]-1;
            if(arr[i]==i+1 || arr[rightIdx]==arr[i]){
                i++;
            }
            else{
                swap(arr, i, rightIdx);
            }
        }
        for(i=0;i<n;i++){
            if(arr[i] != i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    public void swap(int[] arr, int i, int idx){
        int temp= arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
