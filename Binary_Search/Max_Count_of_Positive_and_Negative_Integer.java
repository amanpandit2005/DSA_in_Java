package L17_L18_L19_Binary_Search;

public class Max_Count_of_Positive_and_Negative_Integer {
    public int maximumCount(int[] arr) {
        int n=arr.length;
        int low=0, high=arr.length-1,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>=0){
                high= mid-1;
            }
            else {
                low=mid+1;
            }
        }
        int negCount = low;

        low=0;
        high=arr.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]<=0) {
                low= mid+1;
            }
            else {
                high=mid-1;
            }
        }
        int posCount =n-low;

        return Math.max(negCount, posCount);
    }
}
