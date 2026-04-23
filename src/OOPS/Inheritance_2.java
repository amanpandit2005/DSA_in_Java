package L28_L29_OOPS;

class Vehicle{
    int wheels;
    int speed;
    int seats;
}
class PowerVehicle extends Vehicle{
    int engine;
}
class AirCrafts extends PowerVehicle{
    int rotors;
}
class Animal{
    int size;
    boolean isVegetarian;
}
class Birds extends Animal{
    int maximumAltitude;
}
class AquaticAnimals extends Animal{
    int fins;
}

public class Inheritance_2 {
    public static void main(String[] args) {
        // Vehicle cycle = new Vehicle();

    }
}