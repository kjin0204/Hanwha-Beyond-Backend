package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {
    private String name;
    private int hp;

    public void setInfo1(String info) {
        this.name = info;
    }

    public void setInfo2(int info) {
        if (info >= 0) {
            this.hp = info;

        } else {
            this.hp = 0;
        }
    }

    public String getInfo()
    {
        return this.name + "의 hp는 " + this.hp;
    }
}
