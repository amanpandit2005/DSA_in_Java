package L3_Conditionals;

import java.util.Scanner;

public class Absolute_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(n>=0)
            System.out.println(n);
        else
            System.out.println(n*-1);

// Another Approach using only if

        if(n<0){
            n = -n;
        }
        System.out.println(n);


    }
}
