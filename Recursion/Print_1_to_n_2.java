package L22_L23_L24_L25_Recursion;

import java.util.Scanner;

public class Print_1_to_n_2 {
    static int n; // Global Variable
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        n = sc.nextInt();
        print(1);
    }
    public static void print(int x){
        if(x>n){
            return;
        }
        System.out.println(x);
        print(x+1);
    }
}
// Not Ideal for Interviews