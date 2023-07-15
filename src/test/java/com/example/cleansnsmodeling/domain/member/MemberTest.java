package com.example.cleansnsmodeling.domain.member;

import com.example.cleansnsmodeling.domain.member.entity.Member;
import com.example.cleansnsmodeling.util.MemberFixtureFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MemberTest {
    private int num = 10;
    /*
    고려 사항
    회원 생성은 빌더 패턴으로 ?
    회원 필드 검사는 엔티티 수행 ?

    회원 생성 요청받는 메서드는 서비스 로직에 ?
    그럼 메서드 이름은 ?
    파라미터 타입/수량, 리턴 타입은 ?
    정적 메서드 ? 인스턴스 메서드 ?
    서비스 클래스 이름은 ?
     */

    @Test
    @DisplayName("멤버 랜덤 생성 테스트")
    public void createMembers() {

        // given
        List<Member> members = IntStream.range(0,10)
                .mapToObj(i -> MemberFixtureFactory.create())
                .collect(Collectors.toList());

        // when


        // then
        members.forEach(member -> {
            System.out.println(member.getNickname());
        });
    }

    @Test
    @DisplayName("멤버 닉네임 변경 자리수 10자리 이상 불가")
    public void updateMemberNickname() {
        // given
        Member member = MemberFixtureFactory.create();

        // when
        String invalidNickname = "lengthoverten";


        // then
        // TODO: 2023-07-15 spring validation 사용 여부 결정 필요
        member.updateNickname(invalidNickname);
    }
}
