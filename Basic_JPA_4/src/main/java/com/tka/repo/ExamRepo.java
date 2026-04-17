package com.tka.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.entity.OnlineExam;

@Repository
public interface  ExamRepo extends JpaRepository<OnlineExam,Long> {

}
