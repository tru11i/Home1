package Home2;

public class Aircraft extends Vehicle implements Flyable {
    private int maxAltitude;
    private boolean isFlying;

    public Aircraft(int id, String brand, String model, int year, int maxAltitude) {
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = false;
    }

    @Override
    public void startEngine() {
        System.out.println("Запуск двигателя самолета.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Остановка двигателя самолета.");
    }

    @Override
    public void takeOff() {
        System.out.println("Взлет самолета.");
        isFlying = true;
    }

    @Override
    public void land() {
        System.out.println("Посадка самолета.");
        isFlying = false;
    }

     @Override
    public void displayInfo() {
        System.out.println("Самолет: " + brand + " " + model + " (" + year + ")");
    }

    public void accelerate(int speed) {
        System.out.println("Самолет набирает скорость");
    }

    @Override
    public void brake() {
        System.out.println("Самолет замедляется.");
    }
}


