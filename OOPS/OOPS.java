package L28_L29_OOPS;

class student{
    String name;
    int rno;
    double cgpa;
    void print(){
        System.out.print(rno+" "+name+" "+cgpa+"\n");
    }
}

public class OOPS {
//    public static class student{
//        String name;
//        int rno;
//        double cgpa;
//        void print(){
//            System.out.print(rno+" "+name+" "+cgpa+"\n");
//        }
//    }
    public static void main(String[] args) {
        student s1 = new student(); // Declaration
        s1.name = "Aman";
        s1.rno =  9;
        s1.cgpa = 8.45;
        s1.print();

        student s2 = new student();
        s2.name = "Avdesh";
        s2.rno = 19;
        s2.cgpa = 7.9;
        s2.print();

        student s3 = new student();
        s3.name = "Kalash";
        s3.rno = 33;
        s3.cgpa = 7.4;
        s3.print();

        System.out.print(s1.rno+" "+s1.name+" "+s1.cgpa+"\n");
        System.out.print(s2.rno+" "+s2.name+" "+s2.cgpa+"\n");
        System.out.print(s3.rno+" "+s3.name+" "+s3.cgpa+"\n");
        s3.cgpa = 9.6;
        s3.name  = "Bright";
        s3.rno = 20;
        System.out.print(s3.rno+" "+s3.name+" "+s3.cgpa+"\n");
    }
}
