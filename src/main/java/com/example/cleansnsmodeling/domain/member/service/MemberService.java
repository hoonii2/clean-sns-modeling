package com.example.cleansnsmodeling.domain.member.service;

import com.example.cleansnsmodeling.domain.member.dto.MemberDTO;
import com.example.cleansnsmodeling.domain.member.entity.Member;
import com.example.cleansnsmodeling.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public MemberDTO createMember(MemberDTO memberDTO) {
        Member member = Member.builder()
                .nickname(memberDTO.getNickname())
                .birthday(memberDTO.getBirthDay())
                .build();

        memberRepository.save(member);

        // TODO: 2023-07-15 임시 DTO 생성
        return MemberDTO.builder()
                .id(member.getId())
                .build();
    }
}
