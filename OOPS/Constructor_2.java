package L28_L29_OOPS;

import java.util.Arrays;

public class Constructor_2 {
    public static class StudentData{
        String name;
        int rno;
        int size;
        int[] marks;
        StudentData(int[] s){
            marks = Arrays.copyOf(s,s.length);
        }
        StudentData(int s){
            marks = new int[s];
        }
    }

    public static void main(String[] args) {
        int[] arr = {39,40,34,56,45};
        StudentData s1 = new StudentData(arr);
        System.out.println(arr[0]);
        s1.marks[0] = 55;
        System.out.println(arr[0]);
        StudentData s2 = new StudentData(2);
//        s1.marks[0]=100;
//        s1.marks[1]=10;
//        s1.marks[2]=90;
//        s1.marks[3]=80;
//        s2.marks[0]=50;
//        s2.marks[1]=70;
//        s1.marks[4]=100;
//        s2.marks[2]=100;
    }
}
