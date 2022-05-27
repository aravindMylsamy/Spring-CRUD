package com.tw.studentCRUD.service;

import com.tw.studentCRUD.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    Student getStudentById(Long Id) throws Exception;
    List< Student > getAllStudents();
    Student updateStudent(Long id ,Student student) throws Exception;
    void deleteStudent(Long id) throws Exception;
}
