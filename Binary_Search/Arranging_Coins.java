package L17_L18_L19_Binary_Search;

public class Arranging_Coins {
    public int Sqrt(long n) {
        if(n==0){
            return 0;
        }
        long low = 1, high = n, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid == n/mid) {
                return (int)mid;
            } else if (mid < n/mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int)high;
    }
    public int arrangeCoins(int n) {
        long m = (long)n;
        return (Sqrt(8*m+1)-1)/2;
    }
}
