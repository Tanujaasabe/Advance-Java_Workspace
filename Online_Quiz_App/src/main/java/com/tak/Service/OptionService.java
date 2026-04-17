package com.tak.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tak.entity.Option;
import com.tak.entity.Question;
import com.tak.repo.OptionRepository;
import com.tak.repo.QuestionRepository;

@Service
public class OptionService {

	@Autowired
	private OptionRepository or;
	
	@Autowired
	private QuestionRepository qqr;
	
	public Option AddOption(int question_id,Option o)
	{
		Question q=(Question) qqr.findById(question_id).orElseThrow();
		o.setQuestion(q);
		return or.save(o);
		
	}
	
	public List<Option>listoption(long questionId)
	{
		return or.findByQuestion_QuestionId(questionId);
		
	}

	
	
}
