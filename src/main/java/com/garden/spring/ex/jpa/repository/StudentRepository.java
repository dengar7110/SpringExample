package com.garden.spring.ex.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garden.spring.ex.jpa.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	

}
