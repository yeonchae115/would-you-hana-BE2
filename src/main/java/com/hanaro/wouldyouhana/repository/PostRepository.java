package com.hanaro.wouldyouhana.repository;

import com.hanaro.wouldyouhana.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByLocation(String location);

    // location을 기준으로 최신순 (createdAt)으로 질문 목록을 가져오는 메서드
    @Query("SELECT q FROM Post q WHERE q.location = :location ORDER BY q.createdAt DESC")
    List<Post> findByLocationOrderByCreatedAtDesc(String location);

    List<Post> findByLocationAndCategoryId(String location, Long categoryId);

    // location을 기준으로 최신순 (createdAt)으로 질문 목록을 가져오는 메서드
    List<Post> findByLocationOrderByViewCountDesc(String location);

    @Query("SELECT COUNT(p) FROM Post p WHERE p.customerId = :customerId " +
            "AND p.location = :location " +
            "AND p.createdAt >= :createdAt")
    Long countByCustomerIdAndLocationAndCreatedAt(
            @Param("customerId") Long customerId,
            @Param("location") String location,
            @Param("createdAt") LocalDateTime createdAt);
}
