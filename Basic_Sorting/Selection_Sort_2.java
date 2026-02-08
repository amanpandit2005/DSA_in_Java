package L16_Basic_Sorting;

public class Selection_Sort_2 {
    void selectionSort(int[] arr) {
        int n=arr.length;
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
    }
}
