package diary.spring.service;

import diary.spring.entity.AlreadyPicture;
import diary.spring.entity.Member;
import diary.spring.entity.NotYetPicture;
import diary.spring.entity.Picture;

import java.util.List;

public interface NotYetPictureService {
    Long addNotYetPicture(Long memberId,Long pictureId);

    AlreadyPicture notYetPictureToAlreadyPicture(Long notYetPictureId);

    List<NotYetPicture> notYetPictureList(Long memberId);
}
