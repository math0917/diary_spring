package diary.spring.Entity;

import javax.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String username;
    @OneToOne
    @JoinColumn(name = "already_id")
    private Already already;


}
