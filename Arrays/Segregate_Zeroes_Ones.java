package L9_L10_L11_Arrays;

import java.util.Scanner;

public class Segregate_Zeroes_Ones {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Array's Size: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.print("Enter Elements: ");
            for (int i = 0; i < size; i++)
                arr[i] = sc.nextInt();
            int zeroes=0,ones=0;
            for(int i=0;i<size;i++) {
                if (arr[i] == 0)
                    zeroes++;
                if (arr[i] == 1)
                    ones++;
            }
            System.out.println("Number of Zeroes: "+zeroes);
            System.out.println("Number of Ones: "+ones);
    }
}
