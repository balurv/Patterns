package com.example.Pattern.flyweight.After;

public class FlyingBullet {
    private  double x_cord;
    private double y_cord;
    private  double z_cord;

    private double speed;
    private BulletStatus bulletStatus;

    private long userid;

    private double x_direction;
    private double y_direction;
    private double z_direction;


    private Bullet bullet;

    public double getX_cord() {
        return x_cord;
    }

    public void setX_cord(double x_cord) {
        this.x_cord = x_cord;
    }

    public double getY_cord() {
        return y_cord;
    }

    public void setY_cord(double y_cord) {
        this.y_cord = y_cord;
    }

    public double getZ_cord() {
        return z_cord;
    }

    public void setZ_cord(double z_cord) {
        this.z_cord = z_cord;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public BulletStatus getBulletStatus() {
        return bulletStatus;
    }

    public void setBulletStatus(BulletStatus bulletStatus) {
        this.bulletStatus = bulletStatus;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public double getX_direction() {
        return x_direction;
    }

    public void setX_direction(double x_direction) {
        this.x_direction = x_direction;
    }

    public double getY_direction() {
        return y_direction;
    }

    public void setY_direction(double y_direction) {
        this.y_direction = y_direction;
    }

    public double getZ_direction() {
        return z_direction;
    }

    public void setZ_direction(double z_direction) {
        this.z_direction = z_direction;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
