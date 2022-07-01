package com.example.BaluGuru.bridge;

public class Client {
    public static void main(String[] args) {
        Car car = new RC_car();
        car.startEngine();
        car.moveForward();
        car.turnRight();
        car.moveBackward();
        car.turnLeft();
        car.moveBackward();
        car.turnRight();
        car.stopEngine();
        car.printStatus();
    }
}
