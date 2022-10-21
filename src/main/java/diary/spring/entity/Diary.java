package diary.spring.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Diary {
    @Id @GeneratedValue
    @Column(name = "diary_id")
    private Long id;
}
