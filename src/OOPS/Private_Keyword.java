package L28_L29_OOPS;

class students {
    String name; // null
    private int rno; // 0
    double cgpa; // 0.0
    private void print(){ // Getter
        System.out.print(rno+" "+name+" "+cgpa+"\n");
    }
    void p(){
        print();
    }
//    void getrno(){
//        System.out.println(rno);
//    }
    int Getrno(){ // Getter
        return rno;
    }
    void Setrno(int x){ // Setter
        rno = x;
    }
}

public class Private_Keyword {
//    public static class student {
//        String name;
//        private int rno;
//        double cgpa;
//    }

    public static void main(String[] args) {
        students s1 = new students();
//        s1.print();
        s1.p();
        s1.cgpa=8.9;
        s1.name="Aman";
//        s1.rno=9;
        System.out.println(s1.cgpa);
//        System.out.println(s1.rno);
//        s1.print();
        s1.p();
//        s1.getrno();
        System.out.println(s1.Getrno());
        s1.Setrno(50);
        System.out.println(s1.Getrno());
    }
}
