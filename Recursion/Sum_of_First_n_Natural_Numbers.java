package L22_L23_L24_L25_Recursion;

public class Sum_of_First_n_Natural_Numbers {
    public static int findSum(int n) {
        if(n==1){
            return 1;
        }
        return n + findSum(n-1);

    }
}
