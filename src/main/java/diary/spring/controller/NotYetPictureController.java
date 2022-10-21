package diary.spring.controller;

import diary.spring.entity.AlreadyPicture;
import diary.spring.service.NotYetPictureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class NotYetPictureController {
    private final NotYetPictureService notYetPictureService;

    @PostMapping("/not-yet-pictures/{not-yet-picture-id}")
    public AlreadyPicture notYetPictureToAlreadyPicture(@PathVariable("not-yet-picture-id") Long notYetPictureId) {
        return notYetPictureService.notYetPictureToAlreadyPicture(notYetPictureId);
    }
}
