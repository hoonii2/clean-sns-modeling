package com.example.cleansnsmodeling.util;

import com.example.cleansnsmodeling.domain.member.entity.Member;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;

import java.util.Random;
import java.util.function.Predicate;

public class MemberFixtureFactory {
    static public Member create(){
        Long seed = new Random().nextLong();

        EasyRandomParameters parameters = new EasyRandomParameters()
                .excludeField(Predicate.isEqual("id"))
                .seed(seed)
                .stringLengthRange(2, 10);

        return new EasyRandom(parameters).nextObject(Member.class);
    }
}
