package L8_Methods;

public class Global_and_Local_Variables {
    static int x = 50; // x is Global Variable
    public static void main(String[] args) {
        int n = 10; // Local Variable
        System.out.println(n);
        change(n);
        System.out.println(n);
        System.out.println(x);
        fun();
        int x = 5;
        System.out.println(x); // 5 will be printed because x is now declared in main function. Now x is Local to main function
    }

    public static void change(int n) {
        n = 20;
        System.out.println(x);// Local to Change Function
        int x = 30;
        System.out.println(x); // 5 will be printed because x is now declared in change function. Now x is Local to chane function
    }

    public static void fun() {
//      n = 30; // n is not Local for fun Function
        System.out.println(x);
        int x = 55;
        System.out.println(x); // 5 will be printed because x is now declared in fun function. Now x is Local to fun function
    }
}
