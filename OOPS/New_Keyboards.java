package L28_L29_OOPS;
class Cricketer{
    String name;
    int runs;
    double avg;
//    final String country = "India";
    static String country = "England";
    static void greet(){
        System.out.println("Hello Guys");
    }
}

public class New_Keyboards {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
//        c1.country = "New Zealand";   // Cannot change Contry bcz it is defined as final
        System.out.println(c1.country);
        Cricketer c2 = new Cricketer();
        c1.country = "India"; // Changes static variable permanently
        System.out.println(c2.country);
//        fun(); // Cannot call bcz fun() is not static (missing static after private)
        c1.greet();
        c2.greet();
    }
    private void fun(){
        System.out.println("Hello");
    }

}
