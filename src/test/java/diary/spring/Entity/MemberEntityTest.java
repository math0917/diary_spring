package diary.spring.Entity;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.Fail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class MemberEntityTest {
    @PersistenceContext
    EntityManager em;
    @Test
    public void latest() throws Exception {
        //given
        Member member = new Member("member1");
        em.persist(member);
        //when
        em.flush();
        em.clear();
        if (member.getLatestId() == -1) {
            System.out.println("complete");
        } else {
            System.out.println("fail");
        }

        //then
    }
}