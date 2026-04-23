package L22_L23_L24_L25_Recursion;

import java.util.ArrayList;

public class Recursion_on_Strings {
    public static void main(String[] args) {
        String s = "Aman";
        System.out.println(s);
        change1(s);
        System.out.println(s);

        String[] arr = {"Aman","Avdesh","Rohit","Shubham"};
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        ArrayList<String> al = new ArrayList<>();
        al.add("Deepak");
        al.add("Mohit");
        al.add("Bright");
        al.add("Hritik");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }

    public static void change2(ArrayList<String> al) {
        al.add("Arsh");
    }

    public static void change1(String s) {
        s = "Aman Pandit";
    }
}
