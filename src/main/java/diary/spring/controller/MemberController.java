package diary.spring.controller;

import diary.spring.entity.Member;
import diary.spring.entity.NotYetPicture;
import diary.spring.entity.Picture;
import diary.spring.service.MemberService;
import diary.spring.service.NotYetPictureService;
import diary.spring.service.PictureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
    private final NotYetPictureService notYetPictureService;
    private final PictureService pictureService;
    //    회원가입
    @PostMapping("/members")
    public Member join(@RequestParam("username") String username,
                       @RequestParam("age") int age) {
        Member saveMember = memberService.join(username, age);
        List<Picture> pictures = pictureService.pictures();
        for (Picture picture : pictures) {
            notYetPictureService.addNotYetPicture(saveMember, picture);
        }
        return saveMember;
    }


}
