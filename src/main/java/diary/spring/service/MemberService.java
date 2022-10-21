package diary.spring.service;

import diary.spring.entity.Diary;
import diary.spring.entity.Member;
import org.springframework.stereotype.Service;


public interface MemberService {
    Member join(String username, int age);


}
