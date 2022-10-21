package diary.spring.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import diary.spring.entity.NotYetPicture;
import diary.spring.entity.QMember;
import diary.spring.entity.QNotYetPicture;
import lombok.RequiredArgsConstructor;

import java.util.Map;

import static diary.spring.entity.QMember.member;
import static diary.spring.entity.QNotYetPicture.notYetPicture;

@RequiredArgsConstructor
public class NotYetPictureRepositoryImpl implements NotYetPictureRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;

}
