package Hashmap;


import java.util.HashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(11);
        set.add(22);
        set.add(33);
        set.add(44);
        set.add(66);
        set.add(77);
        set.add(88);
        set.add(99);
        System.out.println(set.size());
        System.out.println(set.contains(22)+" "+set.contains(55));
        System.out.println(set.contains(22));
        set.remove(22);
        System.out.println(set.contains(22));
        System.out.println(set.size());

//        System.out.println(set);

//        set.add(11);
//        set.add(22);
//        set.add(33);
//        set.add(22);
//        set.add(11);
//        set.add(77);
//        set.add(88);
//        set.add(77);
//        System.out.println(set.size());


//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(11);
//        set.add(22);
//        set.add(33);
//        set.add(44);
//        set.add(66);
//        set.add(77);
//        set.add(88);
//        set.add(99);
//        System.out.println(set.size());
//        System.out.println(set.contains(22)+" "+set.contains(55));
//        System.out.println(set.contains(22));
//        set.remove(22);
//        System.out.println(set.contains(22));
//        System.out.println(set.size());
//
//        System.out.println(set);
//
//        set.add(11);
//        set.add(22);
//        set.add(33);
//        set.add(22);
//        set.add(11);
//        set.add(77);
//        set.add(88);
//        set.add(77);
//        System.out.println(set.size());
    }
}
