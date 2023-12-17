package Home2;

public class Boat extends Vehicle implements Swimmable {
    private int maxSpeed;
    private boolean isSailing;

    public Boat(int id, String brand, String model, int year, int maxSpeed) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = false;
    }

    @Override
    public void startEngine() {
        System.out.println("Запуск двигателя лодки.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Остановка двигателя лодки.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Лодка ускоряется.");
    }

    @Override
    public void brake() {
        System.out.println("Лодка замедляется.");
    }

    @Override
    public void startSwimming() {
        System.out.println("Начало движения лодки по воде.");
        isSailing = true;
    }

    @Override
    public void stopSwimming() {
        System.out.println("Прекращение движения лодки по воде.");
        isSailing = false;
    }

     @Override
    public void displayInfo() {
        System.out.println("Лодка: " + brand + " " + model + " (" + year + ")");
    }
}