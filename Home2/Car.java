package Home2;

public class Car extends Vehicle {
    private int fuelCapacity;
    private int currentFuelLevel;

    public Car(int id, String brand, String model, int year, int fuelCapacity) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = 0;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель запустился.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель остановился.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Скорость машины " + speed + " км/ч.");
    }

    @Override
    public void brake() {
        System.out.println("Автомобиль тормозит.");
    }

    public void refuel(int liters) {
        currentFuelLevel += liters;
        System.out.println("Автомобиль заправлен на " + liters + " литров.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Машина: " + brand + " " + model + " (" + year + ")");
    }
}