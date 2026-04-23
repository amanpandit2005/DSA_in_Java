package L9_L10_L11_Arrays;

public class Basics {
    public static void main(String[] args) {

        // Initialization
        int[] x = {6,19,79,21,54,67};

        // Indexing
        System.out.println(x[5]);

        // Updating Elements - Mutability
        x[3] = 91;
        System.out.println(x[3]);

        int[] arr = new int[4];
        arr[0]=34;
        arr[1]=56;
        arr[2]=78;
        arr[3]=-67;

        System.out.println(arr[2]);
    }
}
