package diary.spring.controller;

import diary.spring.entity.Picture;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
public class InitPictureController {

    private final InitPictureService initPictureService;

    @PostConstruct
    public void init() {
        initPictureService.init();
    }

    @Component
    @RequiredArgsConstructor
    static class InitPictureService {

        private final EntityManager em;
        @Transactional
        public void init() {
            for (int i = 0; i < 40; i++) {
                em.persist(new Picture("picture" + i, i));
            }

        }
    }
}
