package com.example.patternGuruBalu.bridge.Device;

import com.example.patternGuruBalu.bridge.Device.interfaces.IDevicePower;
import com.example.patternGuruBalu.bridge.Device.interfaces.IDeviceShowStatus;
import com.example.patternGuruBalu.bridge.Device.interfaces.IDeviceSpeed;

public class Fan implements IDevicePower, IDeviceSpeed, IDeviceShowStatus {

    private boolean isOn = false;
    private int speed = 2;
    @Override
    public boolean isEnable() {
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
    public void setSpeed(int speed) {

        if(speed > 5){
            this.speed = 0;
        } else if (speed < 0) {
            this.speed = 5;
        }
        else {
            this.speed = speed;
        }

    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void printStatus() {
        System.out.println("--------------------------");
        System.out.println("I'm Fan");
        System.out.println("current spped is "+speed);
        System.out.println("--------------------------");
    }
}
