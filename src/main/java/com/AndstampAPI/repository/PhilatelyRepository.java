package com.AndstampAPI.repository;

import com.AndstampAPI.Philately;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PhilatelyRepository extends JpaRepository<Philately, Long> {
	List<Philately> findByStampnameContainingIgnoreCase(String stampname);

}