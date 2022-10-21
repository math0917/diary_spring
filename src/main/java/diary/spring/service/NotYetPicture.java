package diary.spring.service;

import diary.spring.entity.Member;
import diary.spring.entity.Picture;

public interface NotYetPicture {
    Long addNotYetPicture(Member member);

    Picture notYetPictureToAlreadyPicture(NotYetPicture notYet);
}
