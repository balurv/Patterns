package com.example.BaluGuru.bridge;

public class RC_car implements Car{

    boolean isOn = false;

    @Override
    public boolean isEngineOn() {
        return isOn;
    }

    @Override
    public void startEngine() {
        isOn = true;
    }

    @Override
    public void stopEngine() {
        isOn = false;
    }

    @Override
    public void turnLeft() {
        System.out.println( "turning left/");
    }

    @Override
    public void turnRight() {
        System.out.println("turning right");
    }

    @Override
    public void moveForward() {
        System.out.println("moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("moving backward");
    }

    @Override
    public void printStatus() {
        System.out.println("----------------------------");
        System.out.println("This is Rc_Car with");
        System.out.println("Engine is "+(isOn?"on":"off"));
        System.out.println("----------------------------");
    }
}
