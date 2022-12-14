//package spring.crud_prac.repository;// DB member 리스트 가져옴(crate에도 형태 변환 없음)
//
//import org.springframework.stereotype.Repository;
//import spring.crud_prac.dto.requestDto;
//import spring.crud_prac.entity.Member;
//
//import java.util.*;
//
//@Repository
//public class MemberRepository implements MemberInterfaceRepository {
//
//    public static Map<Long, Member> store = new HashMap<>(); // Map에 데이터를 저장함
//    public static long sequence = 0L;
//
//    @Override
//    public Member save(Member member){
////        member.setId(++sequence);
//        store.put(member.getId(), member);
//        return member;
//    }
//
//    @Override
//    public Optional<Member> findById(Long id){
//        return Optional.ofNullable(store.get(id));
//    }
//
//    @Override
//    public Optional<Member> findByName(String name){
//        return store.values().stream()
//                .filter(member -> member.getName().equals(name))
//                .findAny();
//    }
//
//    @Override
//    public List<Member> findAll() {
//        return new ArrayList<>(store.values()); // 멤버 반환
//    }
//}
//
////package spring.crud_prac.repository;
////
////public interface MemberRepository {
////    @Query("select m from member where m.id = :id")
////    Optional<> findById(@Param("id") Long Id);
////
////}