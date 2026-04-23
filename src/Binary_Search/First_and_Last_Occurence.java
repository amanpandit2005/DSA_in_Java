package L17_L18_L19_Binary_Search;

import java.util.ArrayList;

public class First_and_Last_Occurence {
    ArrayList<Integer> find(int arr[], int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int low = 0, high = arr.length - 1, index = -1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                index = mid;
                high = mid - 1;
            }
        }
        ans.add(index);

        low = 0;
        high = arr.length - 1;
        index = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                index = mid;
                low = mid + 1;
            }

        }
        ans.add(index);
        return ans;
    }
}
