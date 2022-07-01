package com.example.BaluGuru.bridge;

public interface Car {

    boolean isEngineOn();
    void startEngine();
    void stopEngine();

    void turnLeft();
    void turnRight();
    void moveForward();
    void moveBackward();

    void printStatus();
}
