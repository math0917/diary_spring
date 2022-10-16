package diary.spring.repository;

import diary.spring.Entity.Already;
import diary.spring.dto.MemberAlreadyDto;

import java.util.Optional;

public interface MemberRepositoryCustom {
    public MemberAlreadyDto findLatestAlreadyById(Long memberId);
}
