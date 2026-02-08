package L9_L10_L11_Arrays;

public class Merge_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 7, 8};
        int[] b = {1,3,6,7,9,11,24};

        int [] c = new int[a.length+b.length];
        merge(c,a,b);
        for (int ele : c) System.out.print(ele+" ");
    }
    public static void merge(int[]c, int[]a, int[]b){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length) c[k++] = (a[i]<b[j]) ? a[i++] : b[j++];
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
}
