package diary.spring.Entity;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Optional;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member{
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String username;
    @OneToOne
    @JoinColumn(name = "already_id")
    private Already already;

    public Member(String username) {
        this.username = username;
    }



    public Optional<Already> getLatest() {
        return Optional.ofNullable(this.already);
    }
}
