package com.ohgiraffers.section02.extend;

/* 설명.
 *  와일드카드(wildcard)
 *  제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때 타입 변수를 제한할 수 있다.
 *  <?>: 제한없음
 *  <? extends Type>: 와일드카드의 상한 제한
 *  <? super Type>: 와일드카드의 하한 제한
* */

public class WildCardFarm {
    /* 필기. RabbitFarm에 모든 타입의 제네릭 클래스만 사용 가능 */
    public void anyType(RabbitFarm<?> farm){
        farm.getRabbit().cry();
    }

    /* 필기. RabbitFarm에 Bunny 타입(Bunny + 상속받은) 제네릭 클래스만 사용 가능(상한제한) */
    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getRabbit().cry();
    }

    /* 필기. RabbitFarm에 Bunny의 상위 제네릭 클래스만 사용 가능(하한제한) */
    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getRabbit().cry();
    }

}
