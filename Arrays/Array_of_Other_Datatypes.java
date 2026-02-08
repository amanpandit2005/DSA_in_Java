package L9_L10_L11_Arrays;

public class Array_of_Other_Datatypes {
    public static void main(String[] args) {
        char ch = '\0';
        System.out.println((int)ch);
        int x = 0;
        System.out.println((char)x);

        String[] arr = {"Aman Pandit","Priyansh","Abhishek"};
                for(int i=0;i< arr.length;i++)
                    System.out.print(arr[i]+" ");
    }
}
