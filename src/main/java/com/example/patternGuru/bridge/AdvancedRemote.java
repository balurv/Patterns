package com.example.patternGuru.bridge;

import com.example.patternGuru.bridge.Interface.DeviceInterfaces.IChannel;
import com.example.patternGuru.bridge.Interface.DeviceInterfaces.IDevice;
import com.example.patternGuru.bridge.Interface.DeviceInterfaces.IVolume;

public class AdvancedRemote extends BasicRemote{

    public AdvancedRemote(IDevice iDevice, IChannel iChannel, IVolume iVolume){
        super(iDevice, iChannel, iVolume);
    }

    public void mute(){
        System.out.println("Remote: Mute");
        iVolume.setVolume(0);
    }

    public void unmute(){
        System.out.println("Remote: Unmute");
        iVolume.setVolume(30);
    }
}
