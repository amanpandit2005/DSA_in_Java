package L9_L10_L11_Arrays;

import java.util.Arrays;

public class Sort_Array_Builtin {
    public static void main(String[] args) {
        int arr[]={1,5,9,8,7};
        print(arr);
        System.out.println();
        Arrays.sort(arr);
        print(arr);

    }
    public static void print(int[] arr){
        for (int i=0;i< (arr.length);i++)
            System.out.print(arr[i]+" ");
    }
}
