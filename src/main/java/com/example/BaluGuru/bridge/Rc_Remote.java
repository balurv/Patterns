package com.example.BaluGuru.bridge;

public class Rc_Remote implements Remote{
    Car car;
    public Rc_Remote(Car car){
        this.car = car;
    }
    @Override
    public void power() {
        System.out.println("engine toggle switched");
        if(car.isEngineOn()){
            car.stopEngine();
        }
        else {
            car.startEngine();
        }
    }

    @Override
    public void turnLeft() {
        car.turnLeft();
    }

    @Override
    public void turnRight() {
        car.turnRight();
    }

    @Override
    public void moveForward() {
        car.moveForward();
    }

    @Override
    public void moveBackward() {
        car.moveBackward();
    }
}
