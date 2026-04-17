package com.mvc.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

	User findByEmail(String email);

	User findByUsername(String name);

}
