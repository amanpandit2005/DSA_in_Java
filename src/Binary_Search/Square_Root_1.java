package L17_L18_L19_Binary_Search;

public class Square_Root_1 {
    int floorSqrt(int n) {
        int root=0;
        for(int i=1;i<=n;i++){
            if(i*i>n){
                break;
            }
            root=i;
        }
        return root;
    }
}
