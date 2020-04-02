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

    public boolean start() {
        running = true;
        speed = 0;
        return true;
    }

    public boolean accelerate(int throttle) {
        speed += throttle;
        return true;
    }

    public boolean brake(int intensity) {
        if (speed > 0) {
            speed -= intensity;
            if (speed < 0) {
                speed = 0;
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
