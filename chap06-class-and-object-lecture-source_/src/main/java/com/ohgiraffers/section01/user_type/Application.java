package com.ohgiraffers.section01.user_type;

public class Application {
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new Member();

        /* 설명. 사람 한명씩 접근해 이름을 부여하는 느낌의 코드 */
        member1.name = "김철수";
        member2.name = "김영희";

        /* 설명. 김영희씨만 우선 완성해 보자 */
        member2.age = 19;
        member2.gender = '여';
        member2.hoobies = new String[]{"볼링", "하키"};
        member2.id = "user02";
        member2.pwd = "pass02";

        System.out.println("");

        int num = 1;
        testMethod(member2,1 );
        System.out.println("개명후 이름 : " + renameMember.name);
        System.out.println("김영희씨 이름 : " + member2.name);

    }

    private static void testMethod(Member m ,int n) {
        System.out.println("개명하고 싶어");
        m.name = "김용희";
    }
}
