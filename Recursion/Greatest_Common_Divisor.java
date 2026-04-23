package L22_L23_L24_L25_Recursion;

import java.util.Scanner;

public class Greatest_Common_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2= sc.nextInt();
        int hcf=1;
        for(int i=2;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF: "+hcf);
    }

    public static int gcd(int n1, int n2) {
        if(n2%n1==0){
            return n1;
        }
        return gcd(n2%n1,n1);
    }
}
