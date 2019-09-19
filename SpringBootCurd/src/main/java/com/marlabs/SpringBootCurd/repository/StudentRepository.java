package com.marlabs.SpringBootCurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marlabs.SpringBootCurd.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
