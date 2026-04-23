package L17_L18_L19_Binary_Search;

public class Peak_Index_in_Mountain_Array {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 1, high = arr.length - 2, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }
}
