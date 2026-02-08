package L28_L29_OOPS;

public class Polymorphism {
    public static class Dog{
        void speaks(){
            System.out.println("Bho Bho");
        }
    }
    public static class Cat {
        void speaks(){
            System.out.println("Meow Meow");
        }
    }
    public static class Pikachu {
        void speaks(){
            System.out.println("Pika Pika");
        }
    }
    public static class Human{
        void speaks(){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Pikachu p = new Pikachu();
        Human h = new Human();

        d.speaks();
        c.speaks();
        p.speaks();
        h.speaks();
    }
}
