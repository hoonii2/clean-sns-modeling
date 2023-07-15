package com.example.cleansnsmodeling.domain.member.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDTO {
    private Long id;
    private String nickname;
    private LocalDate birthDay;
    private LocalDateTime createdAt;
}
