package diary.spring.service;

import diary.spring.entity.AlreadyPicture;
import diary.spring.entity.Member;
import diary.spring.entity.NotYetPicture;

public interface AlreadyPictureService {

    AlreadyPicture alreadyPictureList(Long memberId);

    Long alreadyPictureAdd(Long memberId, Long notYetPictureId);


}
