package com.AndstampAPI.repository;

import com.AndstampAPI.Philately;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhilatelyRepository extends JpaRepository<Philately, Long> {
}