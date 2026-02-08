package L8_Methods;

import java.util.Scanner;

public class Permutation_Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        int nfact=1;
        for (int i=1;i<=n;i++) {
            nfact *= i;
        }
        int rfact=1;
        for (int i=1;i<=r;i++) {
            rfact *= i;
        }
        int nrfact=1;
        for (int i=1;i<=n-r;i++) {
            nrfact *= i;
        }
        System.out.println("nCr: "+nfact/(rfact*nrfact));
        System.out.println("nPr: "+nfact/nrfact);


    }
}
