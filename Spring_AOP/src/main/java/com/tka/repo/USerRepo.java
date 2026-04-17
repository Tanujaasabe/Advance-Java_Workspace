package com.tka.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.entity.User;

@Repository
public interface USerRepo extends JpaRepository<User,Long> {

}
