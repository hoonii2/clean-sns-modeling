package com.example.cleansnsmodeling.domain.member.entity;

import com.example.cleansnsmodeling.domain.global.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "member")
public class Member extends BaseEntity {

    @Transient
    static final int MAX_NICKNAME_LENGTH = 10;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberId")
    private Long id;

    @Column(name = "nickname")
    @Length(max = 10, message = "회원 이름은 최대 10글자")
    private String nickname;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Builder
    public Member(Long id, String nickname, LocalDate birthday) {
        this.id = id;
        this.nickname = nickname;
        this.birthday = birthday;
    }

    public void updateNickname(String toNickname){
        Objects.requireNonNull(toNickname);
        nickname = toNickname;
    }
}
