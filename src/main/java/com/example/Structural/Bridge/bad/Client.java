package com.example.Structural.Bridge.bad;

public class Client {
    public static void main(String[] args) {
        Shape blueSquareShape = new BlueSquareShape();
        blueSquareShape.getShape();

        //problem arises what we need to have triangular shape
        // we need to add two more classes! again :( bad design
    }
}
