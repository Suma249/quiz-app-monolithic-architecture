package com.learning.quiz_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.quiz_app.entity.QuizEntity;

@Repository
public interface QuizRepo extends JpaRepository<QuizEntity, Integer> {

}
