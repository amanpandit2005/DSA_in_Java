package L20_L21_Strings;

public class Builtin_Methods {
    public static void main(String[] args) {
        String s = "Aman Pandit";
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('A'));
        System.out.println(s.indexOf('m'));
        System.out.println(s.indexOf('M'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("Pandit"));
        System.out.println(s.startsWith("A"));
        System.out.println(s.endsWith("t"));
    }
}
