package L16_Basic_Sorting;

public class Bubble_Sort_Reverse {
    public static void print(int[] arr){
        for (int ele:arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6};
        int n= arr.length;
        print(arr);
        for (int i=0;i<n-1;i++){
            int swaps=0;
            for (int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j +1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if(swaps==0)
                break;
        }
        print(arr);
    }
}
