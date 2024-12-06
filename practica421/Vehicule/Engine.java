package Vehicule;

public class Engine 
{
    private int horsepower;
    
    public Engine(int horsepower)
    {
        this.horsepower = horsepower;
    }
    
    public void start()
    {
        System.out.println("Engine started with " + horsepower + " horsepower"); 
    } 
    
    public void stop()
    { 
        System.out.println("Engine stopped"); 
    }
}