package L17_L18_L19_Binary_Search;

public class Square_Root_2 {
    int floorSqrt(int n) {
        int low = 0, high = n, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
