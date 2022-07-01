package com.example.patternGuru.bridge;

import com.example.patternGuru.bridge.Interface.DeviceInterfaces.IChannel;
import com.example.patternGuru.bridge.Interface.DeviceInterfaces.IDevice;
import com.example.patternGuru.bridge.Interface.DeviceInterfaces.IVolume;

public class Demo {
    public static void main(String[] args) {
        testDemo(new Tv(), new Tv(), new Tv());
        testDemo(new Radio(), new Radio(), new Radio());
    }

    private static void testDemo(IDevice iDevice, IChannel iChannel, IVolume iVolume) {
        System.out.println("Test with Basic Remote");
        BasicRemote basicRemote = new BasicRemote(iDevice, iChannel, iVolume);
        basicRemote.power();
        basicRemote.channelUp();
        basicRemote.channelUp();
        basicRemote.channelUp();
        basicRemote.volumeUp();
        basicRemote.channelUp();
        iDevice.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(iDevice, iChannel, iVolume);
        advancedRemote.power();
        advancedRemote.mute();
        iDevice.printStatus();
    }
}
