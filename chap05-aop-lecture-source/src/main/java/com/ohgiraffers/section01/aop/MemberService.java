package com.ohgiraffers.section01.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberDAO memberDAO;

    @Autowired      //Autowired를 지정 하지 않아도 생성자를 만들어주면 알아서 의존성을 주입 시켜줌
    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public List<MemberDTO> findAllMembers() {
        System.out.println("target -> findAllMembers 실행");
        return memberDAO.selectAllMembers();

    }

    public MemberDTO findMemberBy(int index) {
        System.out.println("target -> findMemberBy 실행");
        return memberDAO.selectMemberBy(index);
    }
}
