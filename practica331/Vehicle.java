/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpoo.practica331;

public abstract class Vehicle {
    protected String name;
    protected int capacity;

    public Vehicle(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public abstract void start();
    public abstract void stop();
}

