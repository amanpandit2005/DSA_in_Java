package Arrays_2D;

public class Transpose_of_Matrix {
    public void transpose(int n, int mat[][]) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
}
