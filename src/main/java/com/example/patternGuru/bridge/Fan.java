package com.example.patternGuru.bridge;

import com.example.patternGuru.bridge.Interface.DeviceInterfaces.IDevice;
import com.example.patternGuru.bridge.Interface.DeviceInterfaces.Ispeed;

public class Fan implements IDevice, Ispeed {

    private boolean isOn = false;
    private int speed = 30;
    @Override
    public boolean isEnabled() {
        return isOn;
    }

    @Override
    public void enable() {
        isOn = true;
    }

    @Override
    public void disable() {
        isOn = false;
    }

    @Override
    public void printStatus() {

    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
