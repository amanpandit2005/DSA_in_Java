package L3_Conditionals;

import java.util.Scanner;

public class Area_is_greater_than_Perimeter_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int b = sc.nextInt();
        int area = l * b;
        int perimeter = 2 * (l + b);
        if (area > perimeter)
            System.out.println("Area is greater than Perimeter");
        else if (area==perimeter)
            System.out.println("Area is equal to Perimeter");
        else
            System.out.println("Area is less than Perimeter");


    }
}
