package L13_L14_L15_2D_Arrays;

import java.util.ArrayList;

public class Pascal_Triangle {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j=0;j<=i;j++){
                a.add(0);
            }
            arr.add(a);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    arr.get(i).set(j,1);
                else{
                    int up = arr.get(i-1).get(j);
                    int upLeft = arr.get(i-1).get(j-1);
                    arr.get(i).set(j,up+upLeft);
                }
            }
        }
        return arr.get(n-1);
    }
}
