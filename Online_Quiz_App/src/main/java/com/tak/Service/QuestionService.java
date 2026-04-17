package com.tak.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tak.entity.Option;
import com.tak.entity.Question;
import com.tak.entity.Quiz;
import com.tak.repo.QuestionRepository;
import com.tak.repo.QuizRepository;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepo;

    @Autowired
    private QuizRepository quizRepo;

    // ✅ ADD QUESTION
    public Question addQuestion(Long quizId, Question question) {

        // 🔥 Fetch quiz
        Quiz quiz = quizRepo.findById(quizId.intValue())
                .orElseThrow(() -> new RuntimeException("Quiz not found"));

        // 🔥 Set quiz to question
        question.setQuiz(quiz);

        // 🔥 LINK options to question (MOST IMPORTANT)
        if (question.getOptions() != null) {
            for (Option opt : question.getOptions()) {
                opt.setQuestion(question);
            }
        }

        // 🔥 SAVE ONCE
        return questionRepo.save(question);
    }

    // ✅ GET QUESTIONS BY QUIZ
    public List<Question> getByQuizId(int quizId) {
        return questionRepo.findByQuiz_QuizId(quizId);
    }
}