package com.tak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tak.Service.QuizService;
import com.tak.entity.Question;
import com.tak.entity.Quiz;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    // ✅ Create Quiz
    @PostMapping("")
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizService.saveQuiz(quiz);
    }

    // ✅ Get All Quiz
    @GetMapping("")
    public List<Quiz> getAllQuiz() {
        return quizService.getAllQuiz();
    }
    
    
    
    @GetMapping("/{quizId}/questions")
    public List<Question> getQuestions(@PathVariable int quizId) {
        return quizService.getQuestionsByQuiz(quizId);
    }
}