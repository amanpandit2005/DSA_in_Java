package L16_Basic_Sorting;

public class Kth_Smallest {
    public static int kthSmallest(int arr[], int k) {
        int n=arr.length;
        for (int i=0;i<k;i++) {
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
        return arr[k-1];
    }
}
