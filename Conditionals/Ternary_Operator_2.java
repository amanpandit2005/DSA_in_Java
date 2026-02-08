package L3_Conditionals;

import java.util.Scanner;

public class Ternary_Operator_2 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Number: ");
            int n = sc.nextInt();

            int a = (n>=0) ? 100 : 0;
            System.out.println(a);


        }
    }

