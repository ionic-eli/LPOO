public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Método abstracto
    public abstract void makeSound();

    // Método concreto
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
