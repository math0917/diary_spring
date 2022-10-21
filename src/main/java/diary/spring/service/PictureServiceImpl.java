package diary.spring.service;

import diary.spring.entity.Picture;
import diary.spring.repository.PictureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class PictureServiceImpl implements PictureService{
    private final PictureRepository pictureRepository;
    @Override
    public List<Picture> pictures() {
        return pictureRepository.findAll();
    }
}
