package diary.spring.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Picture {
    @Id @GeneratedValue
    @Column(name = "picture_id")
    private Long id;

    public Picture(String fileName, int dotCount) {
        this.fileName = fileName;
        this.dotCount = dotCount;
    }

    private String fileName;

    private int dotCount;
}
