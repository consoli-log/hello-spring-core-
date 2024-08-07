package soli.hello_spring_core;

import soli.hello_spring_core.member.Grade;
import soli.hello_spring_core.member.Member;
import soli.hello_spring_core.member.MemberService;
import soli.hello_spring_core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
