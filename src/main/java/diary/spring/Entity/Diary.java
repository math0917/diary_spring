package diary.spring.Entity;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Diary extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "diary_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "already_id")
    private Already already;

    private int day;
    @Column(length = 2000)
    private String content;

    public Diary(Already already, int day, String content) {
        this.already = already;
        this.day = day;
        this.content = content;
    }
}
