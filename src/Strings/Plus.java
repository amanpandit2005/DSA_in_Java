package L20_L21_Strings;

public class Plus {
    public static void main(String[] args) {
        String s1 = "Aman ";
        String s2 = "Pandit";
        s1= s1+s2;
        System.out.println(s1);
        s2= s1 +6;
        System.out.println(s2);
        s2+= '\n';
        s2+="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(s2);
        s1= "AMAN"+10+20+30;
        System.out.println(s1);
        s1= 10+20+30+"AMAN"+10+20+30;
        System.out.println(s1);
        s1= 10+20+30+"AMAN"+10+(20+30);
        System.out.println(s1);
    }
}
