package com.example.cleansnsmodeling.domain.member.repository;

import com.example.cleansnsmodeling.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
