package L13_L14_L15_2D_Arrays;

public class Row_with_Max_Sum {
    public static void main(String[] args) {
        int[][] arr =  {{1,2,3,444},{1,2,3,44},{5,6,7,87},{9,7,6,5},{5,3,2,1}};
        int n = arr.length;
        int m = arr[0].length;
        int maxsum = Integer.MIN_VALUE;
        int row = -1;
        for (int i=0;i<n;i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum+=arr[i][j];
            }
            if (sum > maxsum) {
                maxsum = sum;
                row = i;
            }
        }
        System.out.println(maxsum+" "+row);
    }
}
