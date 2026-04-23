package L1_L2_Basics;

public class Typecasting {
    public static void main(String[] args) {
        char ch = 'A';
        int x = ch; //Implicit Typecasting
        System.out.println(x);

        char a = 'a';
        int y = (int)a;  //Explicit Typecasting
        System.out.println(y);

        char c = '1';
        System.out.println((int)c);

        System.out.println(c+0);

        System.out.println(c*1);

        int z = 67;
        char b = (char)z;
        System.out.println(b);

        System.out.println((char)z);
    }
}
