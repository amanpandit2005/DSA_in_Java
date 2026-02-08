package L22_L23_L24_L25_Recursion;

import java.util.Scanner;

public class Exponent_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int a = sc.nextInt();
        System.out.print("Enter Exponent: ");
        int b = sc.nextInt();
        System.out.println(a+" raised to the power "+b+" is: "+power(a,b));

    }
    public static int power(int a, int b ){
        if(b==0){
            return 1;
        }
        int ans = a*power(a,b-1);
        return ans;
    }
}
