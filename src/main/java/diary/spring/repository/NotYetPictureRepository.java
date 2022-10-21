package diary.spring.repository;

import diary.spring.entity.Member;
import diary.spring.entity.NotYetPicture;
import diary.spring.service.NotYetPictureService;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NotYetPictureRepository extends JpaRepository<NotYetPicture, Long>, NotYetPictureRepositoryCustom{
    List<NotYetPicture> findByMember(Member member);

    @EntityGraph(attributePaths = {"Picture", "Member"})
    @Query(value = "select p from NotYetPicture p where p.id = :notYetPictureId")
    NotYetPicture findByIdEager(@Param("notYetPictureId") Long notYetPictureId);
}
