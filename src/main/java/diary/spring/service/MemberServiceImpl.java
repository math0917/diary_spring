package diary.spring.service;

import diary.spring.Entity.Member;
import diary.spring.dto.MemberAlreadyDto;
import diary.spring.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
    @Override
    @Transactional
    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }

    @Override
    public Long findLatestPicture(Long id) {
        return memberRepository.findLatestAlreadyById(id).getLatestId();
    }
}
