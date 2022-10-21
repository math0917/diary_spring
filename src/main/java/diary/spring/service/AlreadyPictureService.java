package diary.spring.service;

import diary.spring.entity.AlreadyPicture;
import diary.spring.entity.Member;
import diary.spring.entity.NotYetPicture;
import org.springframework.stereotype.Service;

public interface AlreadyPictureService {

    AlreadyPicture alreadyPictureList(Member member);

    Long alreadyPictureAdd(Member member, NotYetPicture notYetPicture);


}
