package L20_L21_Strings;

public class Passing_in_Function {
    public static void change(String x) {
        x = "Aman Pandit";
    }

    public static void main(String[] args) {
        String x = "Aman";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
// Pass by Value