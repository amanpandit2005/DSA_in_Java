package L28_L29_OOPS;

public class Passing_OOPS_to_Methods {
    public static class car {
        String name;
        int seats;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(name+" "+seats+" "+length+"m "+type+" "+torque+"nm");
        }
    }

    public static void main(String[] args) {
        car c = new car();
        c.name = "Kia Sonet";
        c.seats = 5;
        c.length = 3.99;
        c.type = "SUV";
        c.torque = 178;
        System.out.println(c.seats);

        change(c); // Pass by Reference

        System.out.println(c.seats);

        c.print();

    }

    public static void change(car x){
        x.seats = 7;

    }
}
