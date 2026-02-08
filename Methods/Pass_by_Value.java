package L8_Methods;

public class Pass_by_Value {
    public static void ChangebyValue(int n) {
        n = 10;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n);
        ChangebyValue(n);
        System.out.println(n);

    }
}
