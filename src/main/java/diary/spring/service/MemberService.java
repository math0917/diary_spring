package diary.spring.service;

import diary.spring.Entity.Member;
import org.springframework.stereotype.Service;


public interface MemberService {

    /**
     * 회원가입
     * @param member
     * @return member.id
     */
    Long join(Member member);

    /**
     * 최근에 그리던 그림
     * @param id
     * @return Already.id or -1
     */
    Long findLatestPicture(Long id);

}
