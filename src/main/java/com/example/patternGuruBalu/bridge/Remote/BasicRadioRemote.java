package com.example.patternGuruBalu.bridge.Remote;

import com.example.patternGuruBalu.bridge.Device.Radio;
import com.example.patternGuruBalu.bridge.Remote.interfaces.IRemoteChannel;
import com.example.patternGuruBalu.bridge.Remote.interfaces.IRemotePower;
import com.example.patternGuruBalu.bridge.Remote.interfaces.IRemoteVolume;

public class BasicRadioRemote implements IRemotePower, IRemoteVolume, IRemoteChannel {
    Radio radio;

    public BasicRadioRemote(Radio radio){
        this.radio = radio;
    }

    @Override
    public void power() {
        if(radio.isEnable()){
            radio.disable();
        }
        else {
            radio.enable();
        }
    }

    @Override
    public void setVolumeUP() {
        System.out.println("Radio: volume up");
       radio.setVolume(radio.getVolume() + 10);
    }

    @Override
    public void setvolumeDown() {
        System.out.println("Radio: volume down");
        radio.setVolume(radio.getVolume()- 10);
    }


    @Override
    public void setChannelUp() {
        System.out.println("Radio: channel up");
        radio.setChannel(radio.getChannel()+1);
    }

    @Override
    public void getChannelDown() {
        System.out.println("Radio: channel down");
        radio.setChannel(radio.getChannel() - 1);
    }
}
