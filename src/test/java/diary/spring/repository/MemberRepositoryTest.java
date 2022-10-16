package diary.spring.repository;

import diary.spring.Entity.Member;
import diary.spring.dto.MemberAlreadyDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class MemberRepositoryTest {
    @PersistenceContext
    EntityManager em;

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 처음등록된_멤버에_latest_조회() throws Exception {
        //given
        Member member1 = new Member("member1");
        em.persist(member1);
        em.flush();
        em.clear();
        MemberAlreadyDto latestAlreadyById = memberRepository.findLatestAlreadyById(member1.getId());

        Assertions.assertThat(latestAlreadyById.getLatestId()).isEqualTo(-1);
        //when

        //then
    }


}