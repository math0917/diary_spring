package diary.spring.service;

import diary.spring.entity.AlreadyPicture;
import diary.spring.entity.Member;
import diary.spring.entity.NotYetPicture;
import diary.spring.entity.Picture;
import diary.spring.repository.AlreadyPictureRepository;
import diary.spring.repository.MemberRepository;
import diary.spring.repository.NotYetPictureRepository;
import diary.spring.repository.PictureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NotYetPictureServiceImpl implements NotYetPictureService{
    private final NotYetPictureRepository notYetPictureRepository;
    private final PictureRepository pictureRepository;
    private final AlreadyPictureRepository alreadyPictureRepository;
    private final MemberRepository memberRepository;
    @Override
    public Long addNotYetPicture(Member member, Picture picture) {
        return createNotYetPicture(member, picture).getId();
    }
    @Override
    public AlreadyPicture notYetPictureToAlreadyPicture(Long notYetPictureId) {
        Map<String, Object> memberPicture = deleteNotYetPictureReturnInfo(notYetPictureId);
        return alreadyPictureRepository.save(createAlreadyPicture(memberPicture));
    }
    @Override
    public List<NotYetPicture> notYetPictureList(Long memberId) {
        Optional<Member> member = memberRepository.findById(memberId);
        if (member.isPresent()) {
            return notYetPictureRepository.findByMember(member.get());
        }
        return null;
    }

    private NotYetPicture createNotYetPicture(Member member, Picture picture) {
        NotYetPicture notYetPicture = new NotYetPicture(member, picture, picture.getDotCount());
        NotYetPicture saveNotYetPicture = notYetPictureRepository.save(notYetPicture);
        return saveNotYetPicture;
    }

    private AlreadyPicture createAlreadyPicture(Map<String, Object> memberPicture) {
        Member member = (Member) memberPicture.get("member");
        Picture picture = (Picture) memberPicture.get("picture");
        int dotCount = (int) memberPicture.get("dotCount");
        return new AlreadyPicture(member, picture, dotCount);
    }

    private Map<String, Object> deleteNotYetPictureReturnInfo(Long notYetPictureId) {
        Map<String, Object> memberPicture = notYetPictureRepository.findMemberPictureById(notYetPictureId);
        notYetPictureRepository.deleteById(notYetPictureId);
        return memberPicture;
    }


}
