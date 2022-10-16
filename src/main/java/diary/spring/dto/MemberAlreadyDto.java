package diary.spring.dto;

import com.querydsl.core.annotations.QueryProjection;
import diary.spring.Entity.Already;
import lombok.Data;

import java.util.Optional;

@Data
public class MemberAlreadyDto {
    private Long latestId;
    @QueryProjection
    public MemberAlreadyDto(Long latestId) {
        this.latestId = latestId;
    }
}
