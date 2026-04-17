package tka.com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tka.com.entity.Employee;

public interface EmpoRepo extends JpaRepository<Employee,Integer>{

}
