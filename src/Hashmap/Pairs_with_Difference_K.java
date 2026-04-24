package Hashmap;

import java.util.HashMap;

public class Pairs_with_Difference_K {
//    class Solution {
//        int countPairs(int[] arr, int k) {
//            HashMap<Integer,Integer> map = new HashMap<>();
//            for (int ele : arr){
//                if(!map.containsKey(ele)){
//                    map.put(ele,1);
//                }
//                else {
//                    map.put(ele, map.get(ele)+1);
//                }
//            }
//            int pairs = 0;
//            for (int ele : map.keySet()){
//                int remain1 = ele - k;
//                int remain2 = ele + k;
//                if(map.containsKey(remain1)){
//                    pairs += (map.get(ele))*(map.get(remain1));
//                }
//                if(map.containsKey(remain2)){
//                    pairs += (map.get(ele))*(map.get(remain2));
//                }
//            }
//            pairs /= 2;
//            return pairs;
//        }
//    }

    class Solution {
        int countPairs(int[] arr, int k) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int ele : arr){
                map.put(ele,map.getOrDefault(ele,0)+1);
            }
            int pairs = 0;
            for (int ele : map.keySet()){
                int remain1 = ele - k;
                int remain2 = ele + k;
                if(map.containsKey(remain1)){
                    pairs += (map.get(ele))*(map.get(remain1));
                }
                if(map.containsKey(remain2)){
                    pairs += (map.get(ele))*(map.get(remain2));
                }
            }
            pairs /= 2;
            return pairs;
        }
    }
}
