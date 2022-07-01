package com.example.Pattern.flyweight.baluSingleton;

import com.example.Pattern.flyweight.After.BulletType;

public class Bullet {

    private Bullet(){

    }
    private static Bullet instance = null;

    public static Bullet getInstance(){
        if(instance == null){
            synchronized (Bullet.class){
                if(instance == null){
                    instance = new Bullet();
                }
            }
        }
        return instance;
    }
    private  double radius;
    private  double weight;
    private byte[] image;
    private BulletType bulletType;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public BulletType getBulletType() {
        return bulletType;
    }

    public void setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
    }
}
