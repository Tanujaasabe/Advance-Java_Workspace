package com.tak.entity;

import java.util.List;

public class AttemptRequest {

    private Long userId;
    private List<AnswerRequest> answers;

    public AttemptRequest(Long userId, List<AnswerRequest> answers) {
        this.userId = userId;
        this.answers = answers;
    }

    public AttemptRequest() {}

    public Long getUserId() {
        return userId;
    }

    public List<AnswerRequest> getAnswers() {
        return answers;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setAnswers(List<AnswerRequest> answers) {
        this.answers = answers;
    }
}