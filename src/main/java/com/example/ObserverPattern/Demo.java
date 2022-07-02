package com.example.ObserverPattern;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.event.subcribe("open",
                new LogOpenListener("C:\\Users\\91903\\IdeaProjects\\" +
                        "factory_pattern\\src\\main\\java\\com\\example\\ObserverPattern\\balu.txt"));
        editor.event.subcribe("save",
                new EmailNotificationListener("balurv@gmail.com"));
        try {
            editor.openFile("test.txt");
            editor.saveFile();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
