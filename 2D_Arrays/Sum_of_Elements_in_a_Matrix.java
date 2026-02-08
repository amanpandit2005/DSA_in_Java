package L13_L14_L15_2D_Arrays;

public class Sum_of_Elements_in_a_Matrix {
    int sumOfMatrix(int N, int M, int[][] arr) {
        int sum = 0;
        for (int i=0;i<N;i++) {
            for (int j=0; j<M; j++) {
                sum=sum+ arr[i][j];
            }
        }
        return sum;
    }
}
