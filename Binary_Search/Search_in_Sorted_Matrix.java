package L17_L18_L19_Binary_Search;

public class Search_in_Sorted_Matrix {
    public boolean searchMatrix(int[][] arr, int target) {
        int rows=arr.length, col=arr[0].length;
        int low=0, high=rows*col-1;
        while(low<=high){
            int mid=(low+high)/2;
            int midRow=mid/col, midCol=mid%col;
            if(arr[midRow][midCol]==target){
                return true;
            }
            else if(arr[midRow][midCol]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
