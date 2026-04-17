package com.tka.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

}
