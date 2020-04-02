package com.company;

public class Automobile {
    private String color;
    private String make;
    private int year;
    private String model;
    private String type;
    private int numberOfCylinders;
    private boolean manualTrans;
    private float speed;
    private boolean running;

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public Automobile(String color,
                      String make,
                      int year,
                      String model,
                      String type,
                      int numberOfCylinders,
                      boolean manualTrans) {
        this.color = color;
        this.make = make;
        this.year = year;
        this.model = model;
        this.type = type;
        this.numberOfCylinders = numberOfCylinders;
        this.manualTrans = manualTrans;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", numberOfCylinders=" + numberOfCylinders +
                ", manualTrans=" + manualTrans +
                ", speed=" + speed +
                ", running=" + running +
                '}';
    }

    public static void main(String[] args) {
        Automobile ericsCar = new Automobile("black",
                "Ford", 2017, "Mustang", "Coupe", 8, true);
        Automobile rashadsTruck = new Automobile("gold",
                "Chevrolet", 2007, "Avalanche", "Truck", 8, false);
        System.out.println(ericsCar.toString());
        System.out.println(rashadsTruck.toString());
    }
}
