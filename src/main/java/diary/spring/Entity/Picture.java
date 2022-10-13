package diary.spring.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Picture {
    @Id
    @GeneratedValue
    @Column(name = "picture_id")
    private Long id;

    private String uuid;
    @Column(name = "file_name")
    private String fileName;
    @Column(name = "dot_count")
    private int dotCount;

}
