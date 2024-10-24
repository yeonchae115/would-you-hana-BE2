package com.hanaro.wouldyouhana.repository;

import com.hanaro.wouldyouhana.domain.Customer;
import com.hanaro.wouldyouhana.domain.Likes;
import com.hanaro.wouldyouhana.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LikesRepository extends JpaRepository<Likes, Long> {

    boolean existsByQuestionAndCustomer(Question question, Customer customer);
    Optional<Likes> findByQuestionAndCustomer(Question question, Customer customer);
    List<Likes> findByCustomer(Customer customer);

}
