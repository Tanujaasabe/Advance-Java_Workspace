package com.tak.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tak.entity.Attempt;
import com.tak.entity.User;



public interface AttemptRepository extends JpaRepository<Attempt, Long> {
	

    
	List<Attempt> findByQuizQuizIdOrderByScoreDesc(int quizId);

    List<Attempt> findByUserUserId(Long userId);
    
    

}