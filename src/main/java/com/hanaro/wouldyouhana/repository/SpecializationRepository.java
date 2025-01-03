package com.hanaro.wouldyouhana.repository;

import com.hanaro.wouldyouhana.domain.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
    Optional<Specialization> findByName(String specializationName);
}
