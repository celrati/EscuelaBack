package com.escuela.demo.escuela.repository;

import com.escuela.demo.escuela.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findStudentById(Long id);
}
