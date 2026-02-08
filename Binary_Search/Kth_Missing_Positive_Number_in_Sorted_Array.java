package L17_L18_L19_Binary_Search;

public class Kth_Missing_Positive_Number_in_Sorted_Array {
    public int kthMissing(int[] arr, int k) {
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            int CorrectNo=mid+1;
            int missing=arr[mid]-CorrectNo;
            if(missing>=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return high+1+k;
    }
}
