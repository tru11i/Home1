package Home2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, "Toyota", "Camry", 2022, 60);
        Aircraft aircraft = new Aircraft(2, "Boeing", "747", 2020, 50000);
        Boat boat = new Boat(3, "Yamaha", "Lodka", 2023, 200);

        car.startEngine();
        car.accelerate(100);
        car.brake();
        car.refuel(20);
        car.displayInfo();

        aircraft.startEngine();
        aircraft.takeOff();
        aircraft.land();
        aircraft.stopEngine();
        aircraft.displayInfo();

        boat.startEngine();
        boat.startSwimming();
        boat.stopSwimming();
        boat.stopEngine();
        boat.displayInfo();
    }
}