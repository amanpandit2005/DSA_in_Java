package L13_L14_L15_2D_Arrays;

import java.util.ArrayList;

public class Spirally_Traversing_a_Matrix {
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length, n = arr[0].length;
        int minRow=0, maxRow=m-1, minCol=0, maxCol=n-1;
        int totalElement=m*n;

        while(minRow<=maxRow && minCol<=maxCol && ans.size()<=totalElement){
            if(ans.size()==totalElement) return ans;
            for(int j=minCol;j<=maxCol;j++){
                ans.add(arr[minRow][j]);
            }
            minRow++;
            if(ans.size()==totalElement) return ans;
            for(int i=minRow;i<=maxRow;i++){
                ans.add(arr[i][maxCol]);
            }
            maxCol--;
            if(ans.size()==totalElement) return ans;
            for(int j=maxCol;j>=minCol;j--){
                ans.add(arr[maxRow][j]);
            }
            maxRow--;
            if(ans.size()==totalElement) return ans;
            for(int i=maxRow;i>=minRow;i--){
                ans.add(arr[i][minCol]);
            }
            minCol++;
        }
        return ans;

    }
}
