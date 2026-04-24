package Hashmap;

import java.util.HashMap;

public class Array_Subset {
//    class Solution {
//        public boolean isSubset(int a[], int b[]) {
//            HashMap<Integer,Integer> aMap = new HashMap<>();
//            for (int ele : a){
//                if(aMap.containsKey(ele)){
//                    int freq = aMap.get(ele);
//                    aMap.put(ele,freq+1);
//                }
//                else {
//                    aMap.put(ele,1);
//                }
//            }
//            HashMap<Integer,Integer> bMap = new HashMap<>();
//            for (int ele : b){
//                if (!aMap.containsKey(ele)){
//                    return false;
//                }
//                if(bMap.containsKey(ele)){
//                    int freq = bMap.get(ele);
//                    bMap.put(ele,freq+1);
//                }
//                else {
//                    bMap.put(ele,1);
//                }
//            }
//            for (int ele : b){
//                int afreq = aMap.get(ele);
//                int bfreq = bMap.get(ele);
//                if (afreq<bfreq){
//                    return false;
//                }
//            }
//            return true;
//        }
//    }

    class Solution {
        public boolean isSubset(int a[], int b[]) {
            HashMap<Integer,Integer> aMap = new HashMap<>();
            for (int ele : a){
                if(aMap.containsKey(ele)){
                    int freq = aMap.get(ele);
                    aMap.put(ele,freq+1);
                }
                else {
                    aMap.put(ele,1);
                }
            }
            for (int ele : b){
                if (!aMap.containsKey(ele)){
                    return false;
                }
                int freq = aMap.get(ele);
                if (freq==0){
                    return false;
                }
                aMap.put(ele,freq-1);
            }
            return true;
        }
    }
}
