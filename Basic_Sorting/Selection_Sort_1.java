package L16_Basic_Sorting;

public class Selection_Sort_1 {
    public static void print(int[] arr){
        for (int ele:arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 0};
        int n = arr.length;
        print(arr);
        for (int i=0;i<n;i++) {
            int min = Integer.MAX_VALUE;
            int minIndex=-1;
            for (int j=i;j<n;j++){
                if (arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        print(arr);
    }
}
