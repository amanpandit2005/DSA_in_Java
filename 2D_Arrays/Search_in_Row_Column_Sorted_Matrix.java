package L13_L14_L15_2D_Arrays;

public class Search_in_Row_Column_Sorted_Matrix {
    public static boolean matSearch(int arr[][], int x) {
        int m = arr.length, n = arr[0].length;
        int i=0, j=n-1;
        while(i<m && j>=0){
            if(arr[i][j]==x) return true;
            else if(arr[i][j]<x) i++;
            else j--;
        }
        return false;
    }
}
