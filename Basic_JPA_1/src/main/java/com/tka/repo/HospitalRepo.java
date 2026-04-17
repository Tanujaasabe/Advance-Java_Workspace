package com.tka.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.entity.Hospital;

@Repository
public interface HospitalRepo extends JpaRepository<Hospital, Long> {

}
