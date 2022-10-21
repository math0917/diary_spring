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
    public Long save(Member member) {
        memberRepository.save(member);
        return member.getId();
    }


}
