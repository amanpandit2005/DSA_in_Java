package L13_L14_L15_2D_Arrays;

public class Multiply_Matrices {
    public static void multiply(int a[][], int b[][], int c[][], int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    c[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }

    }
}
