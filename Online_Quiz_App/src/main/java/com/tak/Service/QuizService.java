package com.tak.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tak.entity.Question;
import com.tak.entity.Quiz;
import com.tak.repo.QuizRepository;

@Service
public class QuizService {

	@Autowired 
    private QuizRepository qr;

//    public Quiz createQuiz(Quiz quiz) {
//        return qr.save(quiz);
//    }
//    
//    
//    public List<Quiz> listQuiz()
//    {
//    	return qr.findAll();
//    }
//    
//   public Quiz getQuizById(int  id)
//   {
//	return qr.findById(id).orElseThrow();   
//   }

   
   public Quiz saveQuiz(Quiz quiz) {
       return qr.save(quiz);
   }

   public List<Quiz> getAllQuiz() {
       return qr.findAll();
   }

  
   
   
   public List<Question> getQuestionsByQuiz(int quizId) {
	    return qr.findQuestionsByQuizId(quizId);
	}

 
}
