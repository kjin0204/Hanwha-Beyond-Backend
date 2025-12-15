package com.ohgiraffers.section01.polymorphism;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println();


        Animal an1 = new Tiger();

        an1.eat();
        an1.run();
        an1.cry();

        System.out.println();

        Animal an2 = new Rabbit();
        an2.eat();      // 런타임 시점에는 오버라이딩 된 자식 객체의 메소드가 동작(동적 바인딩)
        an2.run();
        an2.cry();

        System.out.println();

//        an2.jump()   // 컴파일 시점에는 아직 an2는 정적 바인딩만 지원됨
        ((Rabbit)an2).jump(); // 강제 다운캐스팅 추가 메소드 호출 가능.




    }
}
