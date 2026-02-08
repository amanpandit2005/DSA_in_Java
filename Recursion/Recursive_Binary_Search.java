package L22_L23_L24_L25_Recursion;

public class Recursive_Binary_Search {
    public int helper(int[] nums, int target, int lo, int hi){
        if(lo>hi){
            return -1;
        }
        int mid = lo+(hi-lo)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if (nums[mid]<target){
            return helper(nums,target,mid+1,hi);
        }
        else{
            return helper(nums,target,lo,mid-1);
        }
    }
    public int search(int[] nums, int target){
        int n = nums.length;
        return helper(nums,target,0,n-1);
    }
}
