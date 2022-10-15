package diary.spring.Entity;

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
    @Id
    @GeneratedValue
    @Column(name = "picture_id")
    private Long id;

    private String filePath;
    @Column(name = "file_name")
    private String fileName;
    @Column(name = "dot_count")
    private int dotCount;

    public Picture(String filePath, String fileName, int dotCount) {
        this.filePath = filePath;
        this.fileName = fileName;
        this.dotCount = dotCount;
    }
}
