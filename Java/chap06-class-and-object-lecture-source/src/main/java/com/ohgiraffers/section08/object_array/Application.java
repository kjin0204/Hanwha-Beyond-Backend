package com.ohgiraffers.section08.object_array;

public class Application {

    public static void main(String[] args) {

        Car[] carrArry = new Car[5];
        carrArry[0] = new Car("페라리", 300);
        carrArry[1] = new Car("람보르기니", 350);
        carrArry[2] = new Car("롤스로이스", 250);
        carrArry[3] = new Car("부가티베이론", 400);
        carrArry[4] = new Car("포터", 500);


        for (int i = 0; i < carrArry.length; i++) {
            carrArry[i].driveMaxSpeed();

        }
    }
}
