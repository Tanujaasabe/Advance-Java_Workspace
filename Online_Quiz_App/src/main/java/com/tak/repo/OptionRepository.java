package com.tak.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tak.entity.Option;

public interface OptionRepository extends JpaRepository<Option, Long> {
	
	List<Option> findByQuestion_QuestionId(Long questionId);
}

