package L8_Methods;

import java.util.Scanner;

public class Return_Type {
    public static int sum(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();
        System.out.println(sum(a,b,c));
    }
}
