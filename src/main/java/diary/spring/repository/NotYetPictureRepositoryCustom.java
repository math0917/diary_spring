package diary.spring.repository;

import diary.spring.entity.Member;
import diary.spring.entity.Picture;

import java.util.Map;

public interface NotYetPictureRepositoryCustom {
    Map<String, Object> findMemberPictureById(Long notYetPictureId);
}
