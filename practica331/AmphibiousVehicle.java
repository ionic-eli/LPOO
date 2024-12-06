package lpoo.practica331;

public class AmphibiousVehicle extends Vehicle implements EnginePowered, WaterVehicle, LandVehicle {
    private String fuelType;

    public AmphibiousVehicle(String name, int capacity, String fuelType) {
        super(name, capacity);
        this.fuelType = fuelType;
    }

    @Override
    public void start() {
        System.out.println(name + " is starting with a capacity of " + capacity + " people.");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping.");
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    @Override
    public void sail() {
        System.out.println(name + " is sailing.");
    }

    @Override
    public void drive() {
        System.out.println(name + " is driving.");
    }

    public static void main(String[] args) {
        AmphibiousVehicle amphibiousVehicle = new AmphibiousVehicle("AmphiCar", 4, "Diesel");
        amphibiousVehicle.start();
        amphibiousVehicle.drive();
        amphibiousVehicle.sail();
        amphibiousVehicle.stop();
        System.out.println("Fuel type: " + amphibiousVehicle.getFuelType());
    }
}