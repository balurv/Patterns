package com.example.patternGuruBalu.bridge.Remote;

import com.example.patternGuruBalu.bridge.Device.Fan;
import com.example.patternGuruBalu.bridge.Remote.interfaces.IRemotePower;
import com.example.patternGuruBalu.bridge.Remote.interfaces.IRemoteSpeed;

public class BasicFanRemote implements IRemotePower, IRemoteSpeed {

    Fan fan;
    public BasicFanRemote(Fan fan){
        this.fan = fan;
    }
    @Override
    public void power() {
        if(fan.isEnable()){
            fan.disable();
        }
        else {
            fan.enable();
        }
    }

    @Override
    public void setSpeedUp() {
        System.out.println("Fan: Incremented speed");
        fan.setSpeed(fan.getSpeed()+1);
    }

    @Override
    public void setSpeedDown() {
        System.out.println("Fan: Decremented speed");
        fan.setSpeed(fan.getSpeed() - 1);
    }
}
