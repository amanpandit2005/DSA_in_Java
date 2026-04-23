package L13_L14_L15_2D_Arrays;

public class Set_Matrix_Zeroes_1 {
        public void setMatrixZeroes(int[][] arr) {
            int m = arr.length, n = arr[0].length;
            boolean[] row = new boolean[m];
            boolean[] col = new boolean[n];

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==0){
                        row[i]=true;
                        col[j]=true;
                    }
                }
            }
            for(int i=0;i<m;i++){
                if(row[i]==true){
                    for(int j=0;j<n;j++){
                        arr[i][j]=0;
                    }
                }
            }
            for(int j=0;j<n;j++){
                if(col[j]==true){
                    for(int i=0;i<m;i++){
                        arr[i][j]=0;
                    }
                }
            }
        }

}
