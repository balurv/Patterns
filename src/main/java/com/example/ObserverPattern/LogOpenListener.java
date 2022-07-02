package com.example.ObserverPattern;

import java.io.File;

public class LogOpenListener implements EventListener{

    private File file;

    public LogOpenListener(String fileName){
        this.file = new File(fileName);
    }
    @Override
    public void update(String eventType, File file) {
        System.out.println("save to log "+  file + " :someone has performed "+eventType
                +" operation with the following file: " + file.getName());
    }
}
