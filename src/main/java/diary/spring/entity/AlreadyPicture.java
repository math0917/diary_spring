package diary.spring.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class AlreadyPicture {
    public AlreadyPicture(Member member, Picture picture, int dotCount) {
        this.member = member;
        this.picture = picture;
        this.dotCount = dotCount;
    }

    @Id
    @GeneratedValue
    @Column(name = "already_picture_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "picture_id")
    private Picture picture;

    private int dotCount;

}
