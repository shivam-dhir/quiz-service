package com.shivam.QuizServiceApplication.dao;


import com.shivam.QuizServiceApplication.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
