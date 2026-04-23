package L9_L10_L11_Arrays;

public class Sum_of_Array {
    int arraySum(int arr[]) {
        int sum=0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;

    }
}
