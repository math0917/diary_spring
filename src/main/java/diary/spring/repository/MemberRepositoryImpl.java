package diary.spring.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import diary.spring.Entity.Already;
import diary.spring.Entity.QMember;
import diary.spring.dto.MemberAlreadyDto;
import diary.spring.dto.QMemberAlreadyDto;

import java.util.List;
import java.util.Optional;

import static diary.spring.Entity.QMember.member;

public class MemberRepositoryImpl implements MemberRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    public MemberRepositoryImpl(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }


    @Override
    public MemberAlreadyDto findLatestAlreadyById(Long memberId) {
        return queryFactory
                .select(new QMemberAlreadyDto(
                        member.latestId
                ))
                .from(member)
                .where(member.id.eq(memberId))
                .fetchOne();
    }
}
