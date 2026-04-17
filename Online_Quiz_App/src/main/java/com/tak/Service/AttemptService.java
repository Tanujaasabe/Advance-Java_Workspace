package com.tak.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tak.entity.Answer;
import com.tak.entity.AnswerRequest;
import com.tak.entity.Attempt;
import com.tak.entity.AttemptRequest;
import com.tak.entity.Option;
import com.tak.entity.Question;
import com.tak.entity.Quiz;
import com.tak.entity.User;
import com.tak.repo.AnswerRepo;
import com.tak.repo.AttemptRepository;
import com.tak.repo.OptionRepository;
import com.tak.repo.QuestionRepository;
import com.tak.repo.QuizRepository;
import com.tak.repo.UserRepository;

@Service
public class AttemptService {
	
	@Autowired private AttemptRepository attemptRepo;
    @Autowired private AnswerRepo answerRepo;
    @Autowired private QuestionRepository questionRepo;
    @Autowired private OptionRepository optionRepo;
    @Autowired private UserRepository userRepo;
    @Autowired private QuizRepository quizRepo;

	
    public Attempt submitQuiz(int quizId, AttemptRequest request) {

        User user = userRepo.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Quiz quiz = quizRepo.findById(quizId)
                .orElseThrow(() -> new RuntimeException("Quiz not found"));

        Attempt attempt = new Attempt();
        attempt.setUser(user);
        attempt.setQuiz(quiz);
        attempt.setAttemptDate(LocalDateTime.now());
        attempt.setScore(0);

        // 🔥 FIRST SAVE ATTEMPT
        attempt = attemptRepo.save(attempt);

        int score = 0;

        for (AnswerRequest ans : request.getAnswers()) {

            Question q = questionRepo.findById(ans.getQuestionId())
                    .orElseThrow(() -> new RuntimeException("Question not found"));

            Answer answer = new Answer();
            answer.setAttempt(attempt);   // NOW SAFE
            answer.setQuestion(q);

            if ("MCQ".equalsIgnoreCase(q.getQuestionType())) {

                Option opt = optionRepo.findById(ans.getSelectedOptionId())
                        .orElseThrow(() -> new RuntimeException("Option not found"));

                answer.setSelectedOption(opt);

                if (opt.isCorrect()) {
                    score += q.getMarks();
                }
            } else {
                answer.setAnswerText(ans.getAnswerText());
            }

            answerRepo.save(answer);
        }

        attempt.setScore(score);
        return attemptRepo.save(attempt);
    }
	

}
