package diary.spring.repository;

import diary.spring.entity.Member;
import diary.spring.entity.NotYetPicture;
import diary.spring.service.NotYetPictureService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotYetPictureRepository extends JpaRepository<NotYetPicture, Long>, NotYetPictureRepositoryCustom{
    List<NotYetPicture> findByMember(Member member);
}
