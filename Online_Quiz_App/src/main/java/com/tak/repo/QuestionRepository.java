package com.tak.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tak.entity.Question;
import com.tak.entity.Quiz;
import com.tak.entity.User;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {


    Optional<Question> findById(long question_id);
    
    List<Question> findByQuiz_QuizId(int quizId);
    
}