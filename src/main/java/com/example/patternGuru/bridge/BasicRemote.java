package com.example.patternGuru.bridge;

import com.example.patternGuru.bridge.Interface.DeviceInterfaces.IChannel;
import com.example.patternGuru.bridge.Interface.DeviceInterfaces.IDevice;
import com.example.patternGuru.bridge.Interface.RemotesInterfaces.IChannelRemote;
import com.example.patternGuru.bridge.Interface.RemotesInterfaces.IRemote;
import com.example.patternGuru.bridge.Interface.DeviceInterfaces.IVolume;
import com.example.patternGuru.bridge.Interface.RemotesInterfaces.IVolumeRemote;

public class BasicRemote implements IRemote, IChannelRemote, IVolumeRemote {
    protected IDevice iDevice;
    protected IChannel iChannel;
    protected IVolume iVolume;

    public BasicRemote (IDevice iDevice, IChannel iChannel, IVolume iVolume){
        this.iDevice = iDevice;
        this.iChannel = iChannel;
        this.iVolume = iVolume;
    }
    @Override
    public void power() {
        System.out.println("Remote: power toggle!");
        if(iDevice.isEnabled()){
            iDevice.disable();
        }
        else{
            iDevice.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Radio: Volume Down");
        iVolume.setVolume(iVolume.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: Volume Up");
        iVolume.setVolume(iVolume.getVolume() + 10);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: Channel UP");
        iChannel.setChannel(iChannel.getChannel()+1);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote: Channel Down");
        iChannel.setChannel(iChannel.getChannel() - 1);
    }
}
