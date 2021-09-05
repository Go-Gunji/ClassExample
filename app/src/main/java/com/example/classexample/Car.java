package com.example.classexample;

public class Car {
    protected String info;  // 車の情報
    protected int speed;    // 今の速度
    // デフォルトコンストラクタ
    public Car() {
        this.info = "赤";
        this.speed = 0;
    }
    // コンストラクタ
    public Car(String color) {
        this.info = color;
        this.speed = 0;
    }

    // 加速します
    public void speedUp() {
        this.speed += 50;
    }
    // 減速します
    public void speedDown() {
        this.speed -= 50;
    }
    // 車の情報を取得します
    String getInfo() {
        return this.info;
    }
    // 現在の速度を取得します
    int getSpeed() {
        return this.speed;
    }
}