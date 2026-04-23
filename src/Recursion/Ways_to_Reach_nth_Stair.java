package L22_L23_L24_L25_Recursion;

public class Ways_to_Reach_nth_Stair {
    int countWays(int n) {
        if(n<=2){
            return n;
        }
        return countWays(n-1)+countWays(n-2);
    }
}
