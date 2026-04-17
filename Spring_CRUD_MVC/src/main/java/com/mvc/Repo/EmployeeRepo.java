package com.mvc.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.entity.Employe;

@Repository
public interface EmployeeRepo extends JpaRepository<Employe, Integer> {

}
