package L13_L14_L15_2D_Arrays;

import java.util.ArrayList;

public class Print_Matrix_in_Snake_Pattern {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    ans.add(matrix[i][j]);
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;

    }
}
