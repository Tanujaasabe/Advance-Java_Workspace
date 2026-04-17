package com.tak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tak.Service.QuestionService;
import com.tak.entity.Question;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    // ✅ Add Question to Quiz
    @PostMapping("/{quizId}")
    public ResponseEntity<Question> addQuestion(
            @PathVariable Long quizId,
            @RequestBody Question question) {

        Question savedQuestion = questionService.addQuestion(quizId, question);
        return ResponseEntity.ok(savedQuestion);
    }

    // ✅ Get Questions by Quiz
    @GetMapping("/quiz/{quizId}")
    public ResponseEntity<List<Question>> getQuestions(@PathVariable int quizId) {
        return ResponseEntity.ok(questionService.getByQuizId(quizId));
    }
}