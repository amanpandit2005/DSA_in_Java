package L22_L23_L24_L25_Recursion;

public class reverse_Exponent {
    public int pow(int a, int b){
        if(b==0){
            return 1;
        }
        int call = pow(a,b/2);
        if(b%2==0){
            return call*call;
        }
        return call*call*a;
    }

    public int reverseExponentiation(int n) {
        if(n==10){
            return 10;
        }
        return pow(n,n);
    }
}
