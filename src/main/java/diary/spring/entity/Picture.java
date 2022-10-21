package diary.spring.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Picture {
    @Id @GeneratedValue
    @Column(name = "picture_id")
    private Long id;

    private String fileName;

    private int dotCount;
}
