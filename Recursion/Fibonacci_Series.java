package L22_L23_L24_L25_Recursion;

public class Fibonacci_Series {
    public int nthFibonacci(int n) {
        if(n==0 || n==1){
            return n;
        }
        return nthFibonacci(n-1)+nthFibonacci(n-2);
    }
}
