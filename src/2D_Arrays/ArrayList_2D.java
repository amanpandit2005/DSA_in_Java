package L13_L14_L15_2D_Arrays;

import java.util.ArrayList;

public class ArrayList_2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(12);
        a1.add(14);
        a1.add(16);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(18);
        a2.add(20);
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(22);
        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        System.out.println(arr);
        a1.remove(a1.size()-1);
        a2.add(10);
        System.out.println(arr);
        System.out.println(arr.get(1).get(0));
        arr.get(1).set(1,5);
        System.out.println(arr);
    }
}
