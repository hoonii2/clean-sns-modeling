package com.example.cleansnsmodeling.application.controller;

import com.example.cleansnsmodeling.domain.member.dto.MemberDTO;
import com.example.cleansnsmodeling.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/member")
public class memberController {

    private final MemberService memberService;


    @PostMapping("")
    public MemberDTO createMember(MemberDTO memberDTO){
        return memberService.createMember(memberDTO);
    }
}
