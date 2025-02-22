package com.learning.quiz_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.learning.quiz_app.entity.QuestionEntity;
import com.learning.quiz_app.service.QuestionService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/question")
public class QiuestionsController {

	@Autowired
	private final QuestionService service;
	
	@GetMapping("/allQuestions")
	public ResponseEntity<List<QuestionEntity>> getAllQuestions() {
		//return service.getAllQuestions();
		return  service.getAllQuestions();
	}
	
	@GetMapping("/category/{category}")
	public ResponseEntity<List<QuestionEntity>> getQuestionsByCategory(@PathVariable String category){
		return service.gethQuestionsByCategory(category);
	}
	
	@PostMapping("/addQuestion")
	public ResponseEntity<QuestionEntity> addQuestion(@RequestBody QuestionEntity question) {
		return service.addQuestion(question);
		
	}
}
