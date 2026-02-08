package L20_L21_Strings;

import java.util.Scanner;

public class Number_of_vowels {
    public static void main(String[] args) {
        int VCount = 0, CCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String s = sc.nextLine();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch =='E' || ch == 'I' || ch == 'O' || ch =='U'){
                VCount++;
            }
            else{
                CCount++;
            }
        }
        System.out.println(VCount);
        System.out.println(CCount);
    }
}
