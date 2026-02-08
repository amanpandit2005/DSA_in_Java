package L13_L14_L15_2D_Arrays;

public class Print_Column_Wise {
    public static void main(String[] args) {
        int[][] arr =  {{1,2,3,44},{5,6,7,88},{9,7,6,5},{5,3,2,1}};
        int m = arr.length, n = arr[0].length;
        for (int j=0;j<n;j++){
            for (int i=0;i<m;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
