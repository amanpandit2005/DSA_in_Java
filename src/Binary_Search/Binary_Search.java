package Binary_Search;

public class Binary_Search {
    public int search(int[] arr, int target) {
        int low=0, high=arr.length-1,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
