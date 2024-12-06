public class Dog extends Animal implements Movimiento 
{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    @Override
    public void move() {
        System.out.println(name + " is running.");
    }

    @Override
    public void stop() {
        System.out.println(name + " has stopped.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound();
        dog.sleep();
        dog.move();
        dog.stop();
    }
}