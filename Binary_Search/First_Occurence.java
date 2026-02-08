package L17_L18_L19_Binary_Search;

public class First_Occurence {
    public int binarysearch(int[] arr, int target) {
        int low=0, high=arr.length-1, index=-1, mid;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]<target){
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                index=mid;
                high=mid-1;
            }

        }
        return index;
    }
}
