package diary.spring.Entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Optional;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member{
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String username;

    private Long latestId;

    public Member(String username) {
        this.username = username;
        this.latestId = -1L;
    }




}
