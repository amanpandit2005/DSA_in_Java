package L28_L29_OOPS;

public class Constructor_1 {
    public static class Car{
        String name;
        int price;

        Car(){ // Default Constructor
        }
//        Car(String name, int price) {
//            name = name;
//            price = price;
//        }
        Car(String name, int price) {
            this.name = name;
            this.price = price;
}
        Car(int p, String n) {
            name = n;
            price = p;
        }
        void print(){
            System.out.println(name+" "+ price);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("Alto",50000);
        c1.print();
        Car c2 = new Car(1000000, "Wagonr");
        c2.print();
        Car c3 = new Car();
        c3.name = "Brezza";
    }
}
