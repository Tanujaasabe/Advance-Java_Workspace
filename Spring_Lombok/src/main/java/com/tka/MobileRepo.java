package com.tka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepo extends JpaRepository<Mobile,Long> {

}
