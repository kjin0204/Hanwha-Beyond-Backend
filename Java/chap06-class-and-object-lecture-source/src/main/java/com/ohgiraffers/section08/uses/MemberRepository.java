package com.ohgiraffers.section08.uses;

public class MemberRepository {
    private final static Member[] staticMembers = new Member[30];
    private static int count;

    public void regist(Member[] members) {
        if(count > 25){
            System.out.println("회원이 가득 찼씁니다.");
            return;
        }
        for (int i = 0; i < members.length; i++) {
            staticMembers[count++] = members[i];
        }
    System.out.println("회원 가입을 축하합니다.!");
    }

    public Member[] findAllMembers() {
        return staticMembers;
    }
}
