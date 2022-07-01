package com.example.patternGuruBalu.bridge;

import com.example.patternGuruBalu.bridge.Device.Fan;
import com.example.patternGuruBalu.bridge.Device.Radio;
import com.example.patternGuruBalu.bridge.Remote.BasicFanRemote;
import com.example.patternGuruBalu.bridge.Remote.BasicRadioRemote;

public class main {
    public static void main(String[] args) {
//        testRadio(new Radio());
        testFan(new Fan());
    }

    private static void testFan(Fan fan){
        BasicFanRemote bfr = new BasicFanRemote(fan);
        bfr.power();
        bfr.setSpeedUp();
        bfr.setSpeedUp();
        bfr.setSpeedUp();
        bfr.setSpeedUp();
        bfr.setSpeedDown();
        fan.printStatus();
    }
    private static void testRadio(Radio radio) {
        BasicRadioRemote brr = new BasicRadioRemote(radio);
        brr.power();
        brr.setVolumeUP();
        brr.setVolumeUP();
        radio.printStatus();
    }

}
