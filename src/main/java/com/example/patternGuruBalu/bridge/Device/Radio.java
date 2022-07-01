package com.example.patternGuruBalu.bridge.Device;

import com.example.patternGuruBalu.bridge.Device.interfaces.IDeviceChannel;
import com.example.patternGuruBalu.bridge.Device.interfaces.IDevicePower;
import com.example.patternGuruBalu.bridge.Device.interfaces.IDeviceShowStatus;
import com.example.patternGuruBalu.bridge.Device.interfaces.IDeviceVolume;

public class Radio implements IDevicePower, IDeviceVolume ,IDeviceChannel , IDeviceShowStatus {

    private boolean isOn = false;
    private int channel = 1;

    private int volume = 30;
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
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if(this.volume > 100){
            volume = 100;
        }
        else if (this.volume < 0){
            volume = 0;
        }
        else {
            this.volume = volume;
        }
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm radio.");
        System.out.println("| I'm " + (isOn ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
