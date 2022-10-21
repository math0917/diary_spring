package diary.spring.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.Map;
@RequiredArgsConstructor
public class NotYetPictureRepositoryImpl implements NotYetPictureRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;
    @Override
    public Map<String, Object> findMemberPictureById(Long notYetPictureId) {
        return null;

    }
}
