package com.example.patternGuru.bridge;

import com.example.patternGuru.bridge.Interface.DeviceInterfaces.IChannel;
import com.example.patternGuru.bridge.Interface.DeviceInterfaces.IDevice;
import com.example.patternGuru.bridge.Interface.DeviceInterfaces.IVolume;

public class Radio implements IDevice, IChannel, IVolume {

    private  boolean on = false;
    private int volume = 30;
    private int channel = 1;
    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if(percent >= 100){
            this.volume = 100;
        }
        else if(percent <= 0){
            this.volume = 0;
        }
        else {
            this.volume = percent;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("-------------------------------------");
        System.out.println("I'm  radio");
        System.out.println("I'm "+(on?"Enabled":"Disabled"));
        System.out.println("Current volume is "+volume+"%");
        System.out.println("Current channel is "+channel);
        System.out.println("-------------------------------------");
    }
}
