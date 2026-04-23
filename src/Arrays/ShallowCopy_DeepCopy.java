package L9_L10_L11_Arrays;

import java.util.Arrays;

public class ShallowCopy_DeepCopy {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        int[] x = arr1;   // x is shallow copy of arr
        x[0] = 100;
        System.out.println(arr1[0]);

        int[] arr2= Arrays.copyOf(arr1,arr1.length);
        arr2[0]=105;
        System.out.println(arr2[0]);
        System.out.println(arr1[0]);
    }
}
