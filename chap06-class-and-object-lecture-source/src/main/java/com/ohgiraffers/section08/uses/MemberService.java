package com.ohgiraffers.section08.uses;

public class MemberService {



    public MemberService() {

    }

    public void signUpFiveMembers() {
        Member[] members = new Member[5];

        members[0] = new Member(1, "user1","pass01","홍길동",20,'M');
        members[1] = new Member(2, "user2","pass02","유관순",16,'F');
        members[2] = new Member(3, "user3","pass03","이순신",40,'M');
        members[3] = new Member(4, "user4","pass04","신사임당",36,'F');
        members[4] = new Member(5, "user5","pass05","윤봉길",22,'M');

        MemberRepository repository = new MemberRepository();
        repository.regist(members);
    }

    public void showAllMembers() {
        MemberRepository repository = new MemberRepository();
        Member[] returnMembers = repository.findAllMembers();

        for(Member member : returnMembers){
            System.out.println("member = " + member);
        }


    }
}
