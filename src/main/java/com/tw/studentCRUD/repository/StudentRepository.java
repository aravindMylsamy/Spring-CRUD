package com.tw.studentCRUD.repository;

import com.tw.studentCRUD.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
