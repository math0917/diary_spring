package diary.spring.Entity;

import javax.persistence.*;

@Entity
public class Already {
    @Id
    @GeneratedValue
    @Column(name = "already_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "picture_id")
    private Picture picture;
}
