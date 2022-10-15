package diary.spring.controller;

import diary.spring.Entity.Picture;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@RequiredArgsConstructor
public class InitPicture {
    private final InitPictureService initPictureService;
    @PostConstruct
    public void init() {
        initPictureService.init();
    }

    @Component
    static class InitPictureService {

        @PersistenceContext
        private EntityManager em;
        @Transactional
        public void init() {

            em.persist(makePicture("/img/bear.png", "bear", 3));
            em.persist(makePicture("/img/cherry.png", "cherry", 4));
            em.persist(makePicture("/img/coffee.png", "coffee", 5));
            em.persist(makePicture("/img/rocket.png", "rocket", 6));
            em.persist(makePicture("/img/smile.png", "smile", 7));
            em.persist(makePicture("/img/star.png", "star", 8));


        }

        private Picture makePicture(String filePath, String name, int dotCount) {
            return new Picture(filePath, name, dotCount);
        }
    }

}
