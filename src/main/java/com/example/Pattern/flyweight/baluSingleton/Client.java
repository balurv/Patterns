package com.example.Pattern.flyweight.baluSingleton;

import com.example.Pattern.flyweight.After.BulletType;

public class Client {
    public static void main(String[] args) {
        Bullet fiveMMBullet = Bullet.getInstance();
        fiveMMBullet.setBulletType(BulletType.FIVE_MM);


    }
}
