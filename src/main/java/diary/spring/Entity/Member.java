package diary.spring.Entity;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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



}
