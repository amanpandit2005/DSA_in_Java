package L13_L14_L15_2D_Arrays;

public class Representation {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];  // Rows -> 0 to 3 and Columns -> 0 to 4
        arr[2][3] = 21;
        arr[0][0] = 7;

        for (int i=0;i<4;i++){
            for (int j=0;j<5;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int ele : arr[2])
            System.out.print(ele+" ");

        System.out.println();
        System.out.println();

        int[][] arr1  =  {{1,2,3,4},{5,6,7,8},{8,7,6,5},{4,3,2,1}};
        for (int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] arr1D :arr1){
            for (int ele : arr1D)
                System.out.print(ele+" ");
            System.out.println();
        }

    }
}
