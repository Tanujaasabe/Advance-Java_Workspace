package com.tak.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tak.entity.Answer;

public interface AnswerRepo  extends JpaRepository<Answer,Long>{

}
