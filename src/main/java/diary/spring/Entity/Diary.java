package diary.spring.Entity;

import javax.persistence.*;

@Entity
public class Diary {
    @Id
    @GeneratedValue
    @Column(name = "diary_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "already_id")
    private Already already;

    @Column(length = 2000)
    private String content;
}
