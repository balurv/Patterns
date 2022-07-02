package com.example.ObserverPattern;

import java.io.File;

public class Editor {
    public EventManager event;
    private File file;

    public Editor(){
        this.event = new EventManager("open","save", "delete");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        event.notify("open",file);
    }

    public void saveFile() throws Exception{
        if(this.file != null){
            event.notify("save", file);
        }
        else {
            throw new Exception("please open a file first");
        }
    }
}
