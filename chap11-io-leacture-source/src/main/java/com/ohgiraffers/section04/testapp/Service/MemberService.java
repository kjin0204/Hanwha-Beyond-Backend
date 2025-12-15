package com.ohgiraffers.section04.testapp.Service;

import com.ohgiraffers.section04.testapp.aggregate.AccountStatus;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.MemberRepository;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.ArrayList;

/* 설명. 트랜젝션 처리(DB와의 CRUD 이후 성공 및 실패 여부 처리) 및 비지니스 로직 담당 및 유효성 검사 */
public class MemberService {
    private final MemberRepository memberRepository = new MemberRepository();

    public void findAllMemevers() {
        List<Member> result = memberRepository.findAllMemebers();

        if (!result.isEmpty()) {
            System.out.println("Service에서 조회 확인 : ");
            for (Member member : result) {
                System.out.println("member = " + member);
            }
        }
    }


    public void findMemberBy(int memNo) {
        Member findMember = memberRepository.findMemberBy(memNo);

        if (findMember != null) {
            System.out.println("회원 조회 성공: " + findMember);
        } else {
            System.out.println(memNo + " 번호의 회원은 존재하지 않습니다.");
        }
    }

    public void registMember(Member registMember) {

        /* 설명. 회원가입에서 입력받은값을 제외하고도 두 개의 데이터 추가 */
        /* 설명. 1. 회원 번호 생성 */
        int lastNo = memberRepository.findLastMemberNo();
        registMember.setMemNo(lastNo + 1);

        /* 설명. 2. 회원 활성화 상태 추가 */
        registMember.setAccountStatus(AccountStatus.ACTIVE);

        /* 설명. DML의 성공 여부는 int 값으로 돌아옴 */
        int result = memberRepository.registMember(registMember);

        if (result == 1) {
            System.out.println(registMember.getMemNo() + "회원님 환영합니다.");
        } else {
            System.out.println("회원 가입 실패");
        }
    }

    public Member findMemberForMod(int memNo) {

        Member selectedMember = memberRepository.findMemberBy(memNo);
        Member copyMember = null;

        if (selectedMember != null) {
            /* 설명. 프론트로 반환하기 전에 사본 만들어 Repositroy가 가진 회우너 객체 대신 사본을 반환함(feat. 오염 방지) */
            copyMember = new Member();
            copyMember.setMemNo(selectedMember.getMemNo());
            copyMember.setId(selectedMember.getId());
            copyMember.setPwd(selectedMember.getPwd());
            copyMember.setAge(selectedMember.getAge());
            copyMember.setBloodType(selectedMember.getBloodType());
            copyMember.setAccountStatus(selectedMember.getAccountStatus());
            /* 설명. 깊은 복사 */
            String[] copiedHobbies = selectedMember.getHobbies().clone();
            copyMember.setHobbies(copiedHobbies);
        } else {
            System.out.println("동일한 회원이 없습니다.");
        }

        return copyMember;
    }

    public void mdodifyMember(Member modifiedMember) {
        int result = memberRepository.modifyMember(modifiedMember);
        if(result > 0) {
            System.out.println(modifiedMember.getId() + "회원님의 정보 수정에 성공하였습니다.");
        } else {
            System.out.println("회원 정보 수정에 실패하였습니다.");
        }
    }

    public void removeMember(int memNo) {
        int result = memberRepository.removeMember(memNo);

        if(result > 0) {
            System.out.println("회원 탈퇴가 완료되었습니다.");
        } else {
            System.out.println("회원 탈퇴에 실패하였습니다.");
        }
    }
}
