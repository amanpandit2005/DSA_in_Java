package Hashmap;

import java.util.HashSet;

public class Find_Distinct_Elements {
    class Solution {
        static int distinct(int arr[]) {
            HashSet<Integer> set = new HashSet<>();
            for(int ele : arr) {
                set.add(ele);
            }
            return set.size();
        }
    }
}
