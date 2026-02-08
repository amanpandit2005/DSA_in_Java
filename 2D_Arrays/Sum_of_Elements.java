package L13_L14_L15_2D_Arrays;

public class Sum_of_Elements {
    public static void main(String[] args) {

        int[][] arr =  {{1,2,3,4},{5,6,7,8},{8,7,6,5},{4,3,2,1}};
        for (int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
