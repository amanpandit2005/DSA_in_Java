package L9_L10_L11_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Basics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr);

        System.out.println(arr.get(2));  // arr[2]
        System.out.println(arr.get(3));
        arr.set(3, 50);  // arr[3] = 50
        System.out.println(arr.get(3));

        System.out.println(arr);

        int n = arr.size();  // arr.length
        for (int i=0;i<n;i++)
            System.out.print(arr.get(i)+" ");

        System.out.println();

        for (int ele:arr)
            System.out.print(ele+" ");

        System.out.println();

        arr.add(78);
        System.out.println(arr);

        arr.add(3,100);
        System.out.println(arr);

        arr.remove(arr.size()-1);
        System.out.println(arr);

        int i=0 ,j=arr.size()-1;
        while(i<j){

        }

        Collections.reverse(arr);
        System.out.println(arr);

    }
}
