package L9_L10_L11_Arrays;

public class Passing_Array_to_Methods {
    public static void main(String[] args) {
        int[] x={12,23,34,45,56,};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }

    public static void change(int[] arr){
        arr[2]=99;
    }
}
