package diary.spring.service;

import diary.spring.entity.Diary;
import diary.spring.entity.Member;
import diary.spring.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;
    @Override
    public Long save(String username, int age) {
        Member member = new Member(username, age);
        return memberRepository.save(member).getId();
    }


}
