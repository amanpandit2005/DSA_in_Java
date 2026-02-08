package L17_L18_L19_Binary_Search;

public class Floor_in_Sorted_Array {
    public int findFloor(int[] arr, int target) {
        int low=0, high=arr.length-1,mid, index=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }
            else{
                index=mid;
                low=mid+1;
            }
        }
        return index;
    }
}
