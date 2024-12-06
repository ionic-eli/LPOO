package Vehicule;

import java.util.List;

public class Car 
{
    private String model;
    private int year;
    private Engine engine;
    private List<Tire> tires;
    
    public Car(String model, int year, Engine engine, List<Tire> tires)
    {
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.tires = tires;
    }
    
    // Cohesión: metodos relacionados con la clase Car
    public void startEngine() 
    { 
        engine.start(); 
    } 
    
    public void stopEngine()
    { 
        engine.stop(); 
    } 
    
    public void accelerate() 
    { 
        System.out.println("Car is accelerating"); 
    } 
    
    public void brake() 
    { 
        System.out.println("Car is braking"); 
    }
    
    
}
