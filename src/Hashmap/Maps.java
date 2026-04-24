package Hashmap;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Aman",20);
        map.put("Avdesh",23);
        map.put("Kalash",21);
        map.put("Shashwat",25);
        map.put("Raj",19);

        for (String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }

//        System.out.println(map);
//        System.out.println(map.size());
////        System.out.println(map.remove(20));
//        System.out.println(map.remove("Kalash"));  // Remove and also get the value
//        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.get("Aman"));
//        map.put("Aman",19);
//        System.out.println(map+" "+map.size());
//        System.out.println(map.containsKey("Aman"));
//        System.out.println(map.containsKey("Kalash"));

    }
}
