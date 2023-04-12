package hello.hellospring.Repogitory;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepogitory {
    Member Save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
