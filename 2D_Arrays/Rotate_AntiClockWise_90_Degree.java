package L13_L14_L15_2D_Arrays;

public class Rotate_AntiClockWise_90_Degree {
    public void rotateMatrix(int[][] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int col=0;col<n;col++){
            int i=0, j=n-1;
            while(i<j){
                int temp=arr[i][col];
                arr[i][col]=arr[j][col];
                arr[j][col]=temp;
                i++;
                j--;
            }
        }
    }
}
