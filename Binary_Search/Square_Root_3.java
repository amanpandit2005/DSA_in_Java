package L17_L18_L19_Binary_Search;

public class Square_Root_3 {
    public int mySqrt(int n){
        if(n==0){
            return 0;
        }
        int low=1, high=n,mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(mid==n/mid){
                return mid;
            }
            else if(mid<n/mid){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
}
