package com.tak.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tak.entity.Attempt;
import com.tak.entity.Question;
import com.tak.entity.Quiz;

public interface QuizRepository  extends JpaRepository<Quiz,Integer>{


	List<Question> findQuestionsByQuizId(int quizId);
	
}