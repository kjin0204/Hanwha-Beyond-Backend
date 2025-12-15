package com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {


        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        /* 설명. hashCode는 다른 객체인데 같은 값이 나오는 경우도 있다. , System.identityHashCode 좀더 정확 함*/
        System.out.println("eager1 주소 = " + System.identityHashCode(eager1));
        System.out.println("eager1 주소 = " + System.identityHashCode(eager1));

        LazySinglton lazy1 = LazySinglton.get_instance();
        LazySinglton lazy2 = LazySinglton.get_instance();

        System.out.println("lazy1 주소 = " + System.identityHashCode(lazy1));
        System.out.println("lazy2 주소 = " + System.identityHashCode(lazy2));
    }
}
