package Vehicule;

public class Tire {
    private int pressure;

    public Tire(int pressure) {
        this.pressure = pressure;
    }

    public void inflate() {
        System.out.println("Tire inflated to " + pressure + " PSI");
    }

    public void deflate() {
        System.out.println("Tire deflated");
    }
}
