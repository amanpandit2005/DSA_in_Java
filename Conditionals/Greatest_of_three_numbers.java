package L3_Conditionals;

import java.util.Scanner;

public class Greatest_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();

        if (a > b && a > c)
            System.out.println("1st Number is Greatest");
        else if (b > a && b > c)
            System.out.println("2nd Number is Greatest");
        else if (c > a && c > b)
            System.out.println("3rd Number is Greatest");
        else
            System.out.println("All are Equal");


//  Another Approach

        if (a > b && a > c)
            System.out.println("1st Number is Greatest");
        else if(a==b && b==c)
            System.out.println("All are Equal");
        else{
            if (b > a && b > c)
                System.out.println("2nd Number is Greatest");
            else
                System.out.println("3rd Number is Greatest");
        }

//  Another Approach

        if (a>b){
            if (a>c)
                System.out.println("1st Number is Greatest");
            else
                System.out.println("3rd Number is Greatest");
        }

         else if (b>a){
            if (b>c)
                System.out.println("2nd Number is Greatest");
            else
                System.out.println("3rd Number is Greatest");
        }

         else
            System.out.println("All are Equal");



    }
}
